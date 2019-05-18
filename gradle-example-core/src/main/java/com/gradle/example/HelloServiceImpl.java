package com.gradle.example;

import com.google.common.collect.Lists;
import com.grable.example.HelloService;
import com.grable.example.Person;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<Person> list = Lists.newArrayList();

        Person person = Person.builder()
                .id(10001)
                .name("test")
                .build();
        list.add(person);
        list.stream().forEach(System.out::println);
        return person;
    }
}
