package com.example.hellostarter;

import org.example.hello.ConsoleHelloService;
import org.example.hello.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class) // only if we need this class in the app
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    @Conditional(OnValidHelloPrefixCondition.class) // attach your own conditional class
    public HelloService helloService(HelloProperties helloProperties){
        return new ConsoleHelloService(
                helloProperties.getPrefix(),
                helloProperties.getSuffix()
        );
    }
}
