package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Bar;
import com.rapidtech.demospringboot.model.Foo;
import com.rapidtech.demospringboot.model.FooBar;
import jdk.nashorn.api.tree.ForOfLoopTree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepedencyInjection {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar foobar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
