package com.gradle.example;

import com.grable.example.HelloService;
import com.grable.example.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.gradle.example.HelloController
 *
 * @author lipeng
 * @date 2019-05-17 17:51
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello("gradle");
    }

    @GetMapping("/person")
    public Person getPerson() {
        return helloService.getPerson();
    }
}
