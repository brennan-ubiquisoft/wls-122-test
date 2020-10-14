package com.hi.tim.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @PostMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hi Tim!");
    }
}
