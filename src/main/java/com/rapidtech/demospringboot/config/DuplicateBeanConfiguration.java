package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateBeanConfiguration {

    @Primary
    @Bean(value = "foo1")
    public Foo foo1(){
        Foo foo = new Foo();
        return foo;
    }

    @Bean(value = "foo2")
    public Foo foo2(){
        Foo foo = new Foo();
        return foo;
    }
}
