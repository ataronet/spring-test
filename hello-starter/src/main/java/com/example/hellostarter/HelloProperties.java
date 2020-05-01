package com.example.hellostarter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("hello") //section in the application.yml
@ConstructorBinding
public class HelloProperties {
    /**
     * Configuration of the hello service, with defaults
     */
    final String DEFAULT_PREFIX = "hello";
    final String DEFAULT_SUFFIX = "!";

    private String prefix;
    private String suffix;

    public HelloProperties(String prefix, String suffix) {
        this.prefix = (prefix != null)? prefix: DEFAULT_PREFIX;
        this.suffix = (suffix != null)? suffix: DEFAULT_SUFFIX;
    }

    public String getPrefix() {
        return prefix;
    }
    public String getSuffix() {
        return suffix;
    }
}
