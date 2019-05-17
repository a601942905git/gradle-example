package com.gradle.example;

import com.grable.example.HelloService;
import com.grable.example.Person;
import org.springframework.stereotype.Service;

/**
 * com.gradle.example.HelloServiceImpl
 *
 * @author lipeng
 * @date 2019-05-17 17:18
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public Person getPerson() {
        Person person = Person.builder()
                .id(10001)
                .name("test")
                .build();
        return person;
    }
}
