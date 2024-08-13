# Demo: `DynamicPropertyRegistry` in `@Bean` does not work in Spring Boot 3.4

## How to run

**Mit Spring Boot 3.3.2**

```bash

cd 3_3_2

./mvwn clean package

```

- Tests will run **successfully* 

**Mit Spring Boot 3.4.0-M1**

```bash

cd 3_4_0_M1

./mvwn clean package
```

- Tests will **fail* with error:
```
***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of method dummyService in com.example.demo.DemoTestConfig required a single bean, but 2 were found:
- dynamicPropertyRegistry: defined by method 'dynamicPropertyRegistry' in class path resource [org/springframework/boot/testcontainers/properties/TestcontainersPropertySourceAutoConfiguration.class]
- org.springframework.test.context.support.DynamicPropertiesContextCustomizer.dynamicPropertyRegistry: a programmatically registered singleton
```


- Remove dependency `org.springframework.boot:spring-boot-testcontainers` from `pom.xml` and run again: Test will run **successfully**
