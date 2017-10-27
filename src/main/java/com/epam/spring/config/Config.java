package com.epam.spring.config;

import com.epam.spring.bean.SomeBean;
import com.epam.spring.bean.StateBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.epam.spring",
        excludeFilters = {@ComponentScan.Filter(
                value=Component.class,
                type = FilterType.ANNOTATION
        )}
)
public class Config {
    @Bean
    public SomeBean someBean(){
        return new SomeBean();
    }

    @Bean
    public StateBean stateBean(){
        return new StateBean();
    }
}
