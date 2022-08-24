package com.books.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class BooksController {

    @GetMapping("/")
    public String main(){

        log.info("******* 메인 화면 접속 **********");

        return "main";
    }
}
