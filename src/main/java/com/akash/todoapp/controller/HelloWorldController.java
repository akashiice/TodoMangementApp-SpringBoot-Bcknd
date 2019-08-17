package com.akash.todoapp.controller;

import com.akash.todoapp.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String helloWorld()
    {
        return "hello world";
    }
    @GetMapping(value = "/helloWorldBean/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name)
    {
        return new HelloWorldBean("Hello World"+name);
    }
}
