package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Import({DemoTestConfig.class})
public class DemoTest {
    private static final Logger log = LoggerFactory.getLogger( DemoTest.class );

    @Test
    void test_dynamic(@Autowired DemoService ds) {
        assertEquals("Hello World", ds.getProp());
    }

}
