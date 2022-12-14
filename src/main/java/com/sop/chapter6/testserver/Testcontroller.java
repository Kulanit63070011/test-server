package com.sop.chapter6.testserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Testcontroller {

    @Autowired
    private Environment env;

    @GetMapping
    public String getPort(){
        return "port " + env.getProperty("local.server.port");
    }
}
