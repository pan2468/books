package com.books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestfulController {

    @GetMapping("/login")
    public String member_test(){

        return "Hello World";
    }
}
