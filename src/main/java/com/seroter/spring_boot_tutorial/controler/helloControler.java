package com.seroter.spring_boot_tutorial.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//  @Controller by default this return the componet
@RestController
public class helloControler {

   // @RequestMapping(value = "/", method = RequestMethod.GET)

    @GetMapping("/")
    public String GreetControler() {
        return "Wellcome to the Spring-Boot Tutorial BY akshay Peherkar :( ";
    }
}
