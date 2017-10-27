package com.epam.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SomeBean implements InitializingBean, DisposableBean {

    @Value("Main Bean")
    private String name;
    @Autowired
    private StateBean stateBean;

    public void destroy() throws Exception {
        System.out.println("destroying");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing main");
    }
}
