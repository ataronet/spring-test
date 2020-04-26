package com.example.hellostarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hello") //section in the application.yml
public class HelloProperties {
    /**
     * Configuration of the hello service, with defaults
     */
    private String prefix = "Hello";
    private String suffix = "!";

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
