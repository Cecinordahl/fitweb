package com.example.fitweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FitController {

    @GetMapping("/")
    public String homePage(){
        return "index";
    }
}
