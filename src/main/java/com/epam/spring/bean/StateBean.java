package com.epam.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class StateBean implements InitializingBean, DisposableBean {

    @Value("State Bean")
    private String name;

    public void destroy() throws Exception {
        System.out.println("destroying");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing state");
    }
}
