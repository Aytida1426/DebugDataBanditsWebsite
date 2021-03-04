package com.debugdatabandits.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return "Greeting";
    }
}