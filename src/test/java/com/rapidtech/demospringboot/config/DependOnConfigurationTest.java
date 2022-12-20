package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Bar;
import com.rapidtech.demospringboot.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DependOnConfigurationTest {

    @Test
    void dependOnTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DependOnConfiguration.class);
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo1, foo3);


//        Bar bar1 = context.getBean(Bar.class);
//        Bar bar2 = context.getBean(Bar.class);
//        Assertions.assertSame(bar1, bar2);

    }
}