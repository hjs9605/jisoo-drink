package com.example.jisoodrink.Controller;

import java.util.Arrays;
import java.util.List;

import com.example.jisoodrink.DTO.LoginDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello";
    }

    @PostMapping("/api/login")
    public String login(@RequestBody LoginDTO loginDTO) {
        return "Hello";
    }
}
