package com.cyriljoui.spring.poc.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.customz")
public class CustomProperties {
    private String propertyA;

    private String propertyB;

    public CustomProperties() {
    }

    public String getPropertyA() {
        return propertyA;
    }

    public void setPropertyA(String propertyA) {
        this.propertyA = propertyA;
    }

    public String getPropertyB() {
        return propertyB;
    }

    public void setPropertyB(String propertyB) {
        this.propertyB = propertyB;
    }
}
