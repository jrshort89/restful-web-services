package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSoure;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloworld")
    public String helloWorldBean() {
        return new HelloWorld("Hello Worlds").toString();
    }

    @GetMapping("/helloworldinternational")
    public String helloWorldBeanInternational(@RequestHeader(name="Accept-Language", required = false)Locale locale){
        return messageSoure.getMessage("good.morning.message", null, "Default Message", LocaleContextHolder.getLocale());
    }

    @GetMapping("/helloworld/{name}")
    public String helloWorldBean(@PathVariable String name){
        return new HelloWorld("Hello World, " + name).toString();
    }
}