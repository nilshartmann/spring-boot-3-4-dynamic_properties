package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    final String demoTestProp;
    DemoService(DummyService dummyService, @Value("${demo.test.prop}") String demoTestProp) {

        this.demoTestProp = demoTestProp;
    }

    public String getProp() {
        return this.demoTestProp;
    }

}
