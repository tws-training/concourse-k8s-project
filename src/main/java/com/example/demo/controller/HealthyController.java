package com.example.demo.controller;

import com.example.demo.domain.Fibonacci;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthy")
public class HealthyController {

    @RequestMapping(method = RequestMethod.GET)
    public String getResult() {
        return "OK";
    }
}
