package com.example.fitweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FitController {
    public Integer ageInput;

    @GetMapping("/")
    public String homePage(Model model){
        if(ageInput != null){
            model.addAttribute("inputAge", ageInput);
        }
        return "macro_calculator";
    }

    @PostMapping("/")
    public String homePagePost(@RequestParam Integer age){
        ageInput = age;
        return "redirect:/";
    }
}
