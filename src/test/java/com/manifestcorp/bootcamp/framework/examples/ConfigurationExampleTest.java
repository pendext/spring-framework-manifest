package com.manifestcorp.bootcamp.framework.examples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConfigurationExampleTest {

    
    @Autowired
    ConfigurationExample configurationExample;

    @Test
    public void environmentVariableExample() {
        String expectedValue = "expectedValue";
        String expectedKey = "expectedKey";

        assertThat(expectedValue).isEqualTo(configurationExample.getPropertyFromEnvironmentVariable(expectedKey));
    }

    @Test
    public void propertiesExample() {
        String expectedValue = "propertyValue";
        String expectedKey = "propertyKey";

        assertThat(expectedValue).isEqualTo(configurationExample.getPropertyFromProperties(expectedKey));
    }

}