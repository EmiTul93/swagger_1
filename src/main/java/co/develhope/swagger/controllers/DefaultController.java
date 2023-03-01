package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DefaultController {

    @GetMapping("/spring")
    public String hi(){
    return "Hello, it's me";
    }
}