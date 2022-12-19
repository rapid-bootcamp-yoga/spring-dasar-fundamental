package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        return foo;
    }

}
