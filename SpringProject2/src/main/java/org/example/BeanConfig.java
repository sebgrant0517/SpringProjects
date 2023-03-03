package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanConfig {
    @Bean
    public Address getAddress(){
        return new Address("Thomasville", "North Carolina", "USA", "27360");
    }

    @Bean
    public Phone getCell(){
        return new Phone("336-123-4567");
    }

    @Bean
    public Phone getHome(){
        return new Phone("336-321-8989");
    }

    @Bean
    @Autowired
    public Student getStudent(List<Phone> phones, Address address){
        return new Student(47, "James Bond", phones, address);
    }
}
