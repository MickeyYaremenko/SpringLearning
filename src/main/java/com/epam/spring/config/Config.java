package com.epam.spring.config;

import com.epam.spring.aspect.SomeAspect;
import com.epam.spring.bean.Cat;
import com.epam.spring.bean.Dog;
import com.epam.spring.bean.SomeBean;
import com.epam.spring.bean.StateBean;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Config {
    @Bean
    public SomeBean someBean(){
        return new SomeBean();
    }

    @Bean
    public StateBean stateBean(){
        return new StateBean();
    }

    @Bean
    public SomeAspect someAspect() {
        return new SomeAspect();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
