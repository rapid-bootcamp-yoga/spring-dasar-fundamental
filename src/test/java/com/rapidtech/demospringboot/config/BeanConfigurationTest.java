package com.rapidtech.demospringboot.config;

import com.rapidtech.demospringboot.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BeanConfigurationTest {
    @Test
    void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        Assertions.assertSame(foo1,foo2);
        Assertions.assertSame(foo2,foo3);

    }
}