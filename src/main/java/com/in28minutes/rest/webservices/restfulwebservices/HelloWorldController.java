package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloworld")
    public String helloWorldBean(){
        return new HelloWorld("Hello World").toString();
    }
}
