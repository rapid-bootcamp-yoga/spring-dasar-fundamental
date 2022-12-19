package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Bar;
import com.rapidtech.demospringboot.model.Foo;
import com.rapidtech.demospringboot.model.FooBar;
import jdk.nashorn.api.tree.ForOfLoopTree;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DepedencyInjection {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }
    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar foobar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
