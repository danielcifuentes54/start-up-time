package com.startup.time.startuptime.controllers;

import com.startup.time.startuptime.api.dto.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/springboot")
public class HelloController {

    @GetMapping(value = "/hello")
    public ResponseEntity<Greeting> hello() {
        Greeting greeting = new Greeting();
        greeting.setAction("Hello!!!");
        return ResponseEntity.ok(greeting);
    }
}
