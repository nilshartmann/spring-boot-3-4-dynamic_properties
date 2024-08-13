package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import({DemoTestConfig.class})
public class DemoTest {
    private static final Logger log = LoggerFactory.getLogger( DemoTest.class );
    @Test
    void test_dynamic() {
        // will not be invoked
        log.info("hallo...");
    }

}
