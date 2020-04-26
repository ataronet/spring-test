package com.example.hellostarter;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnValidHelloPrefixCondition.class) // attach your own conditional class
public @interface ConditionalOnValidHelloPrefix {
}
