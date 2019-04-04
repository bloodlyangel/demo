package com.gary.demo;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DockerController {

    @RequestMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}