package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Bar;
import com.rapidtech.demospringboot.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;

//import static com.sun.java.util.jar.pack.Utils.log;

@Slf4j
@Configuration
public class DependOnConfiguration {

    @Lazy
    @DependsOn(value = {"foo"})
    @Bean
    public Bar bar(){
        log.debug("Creating new Bar");
        return new Bar();
    }

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.debug("Creating new Foo");
        return new Foo();
    }

}
