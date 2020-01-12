package com.fightvest.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/")
    String index() {
        return "Hello World at /index page";
    }
}
