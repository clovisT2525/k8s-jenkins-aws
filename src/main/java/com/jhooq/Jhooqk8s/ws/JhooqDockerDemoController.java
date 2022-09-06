package com.clovis01.clovis01k8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clovis01DockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - clovis01-k8s i Have updated the message";
    }
}
