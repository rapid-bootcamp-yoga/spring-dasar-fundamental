package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Bar;
import com.rapidtech.demospringboot.model.Foo;
import org.springframework.context.annotation.Bean;

import static com.sun.java.util.jar.pack.Utils.log;

public class DependOnConfiguration {
    @Bean
    public Bar bar(){
        log.debug("Creating new Bar");
        return new Bar();
    }

    @Bean
    public Foo foo(){
        log.debug("Creating new Foo");
    }

}
