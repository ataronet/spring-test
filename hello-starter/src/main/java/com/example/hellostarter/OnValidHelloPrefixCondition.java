package com.example.hellostarter;

import org.springframework.boot.autoconfigure.condition.ConditionMessage;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

// Write your own conditional class
class OnValidHelloPrefixCondition extends SpringBootCondition {
    private static final String PROPERTY_NAME = "hello.prefix";

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        ConditionMessage.Builder condition = ConditionMessage.forCondition(ConditionalOnValidHelloPrefix.class);
        if (environment.containsProperty(PROPERTY_NAME)) {
            String value = environment.getProperty(PROPERTY_NAME);
            if(value != null && !value.isEmpty() && Character.isUpperCase(value.charAt(0))){
                return ConditionOutcome.match(
                        condition.available(String.format("Prefix '%s' starts with capital letter, yey!", value))
                );
            } else {
                return ConditionOutcome.noMatch(
                        condition.because(String.format("Value for '%s' does not start with capital letter", PROPERTY_NAME))
                );
            }
        }
        return ConditionOutcome.match(
                condition.because(String.format("Value for '%s' was not found, loading defaults", PROPERTY_NAME))
        );
    }
}
