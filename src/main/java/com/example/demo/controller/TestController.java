package com.example.demo.controller;

import com.example.demo.model.Perro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/perro")
    public Perro getPerro(@RequestBody Perro perro) {
        return perro;
    }
}
