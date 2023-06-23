package com.example.jisoodrink;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("hello")
    public List<String> hello() {
        return Arrays.asList("안녕하세요", "Hello");
    }
}
