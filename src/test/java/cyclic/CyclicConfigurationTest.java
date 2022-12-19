package cyclic;

import com.rapidtech.demospringboot.cyclic.CyclicConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CyclicConfigurationTest {
    private ApplicationContext context;

//    try {
//
//    } catch {
//
//    }
    @BeforeEach
    void setUp() {

    }

    @Test
    void circularTest() {
        Assertions.assertThrows(Throwable.class,() -> {
            context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });
    }
}