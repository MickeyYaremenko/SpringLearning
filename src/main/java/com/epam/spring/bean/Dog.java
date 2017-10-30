package com.epam.spring.bean;

import com.epam.spring.common.Pet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Dog implements Pet {

    @Value("Barkinson")
    private String name;
}
