package com.example;

import com.example.config.MyAutoConfiguration;
import com.example.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoConfigurationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(MyAutoConfiguration.class));

    @Test
    public  void serviceNameCanBeConfigured() {
        this.contextRunner.withUserConfiguration(MyAutoConfiguration.class).run((context) -> {
            assertThat(context).hasSingleBean(MyService.class);
           // assertThat(context.getBean(MyService.class).isAutoConfig()).isTrue();
        });
    }
}