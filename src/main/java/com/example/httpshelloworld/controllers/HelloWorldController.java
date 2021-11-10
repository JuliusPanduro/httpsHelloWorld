package com.example.httpshelloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Julius Panduro
 */
@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld (){
    return "index";
    }


}
