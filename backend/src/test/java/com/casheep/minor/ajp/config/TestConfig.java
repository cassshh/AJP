package com.casheep.minor.ajp.config;

import com.casheep.minor.ajp.service.LaptopService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.casheep.minor.ajp")
public class TestConfig {

    @Bean
    public LaptopService laptopServiceMock() {
        return Mockito.mock(LaptopService.class);
    }
}
