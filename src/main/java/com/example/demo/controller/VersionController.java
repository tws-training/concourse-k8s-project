package com.example.demo.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/version")
public class VersionController {

    @RequestMapping(method = RequestMethod.GET)
    public String getVersion() {
        String version = System.getenv("APP_VERSION");
        if(version == "" || version == null) {
            version = "0.9.9-alpha";
        }
        return version;
    }
}
