package com.example.fitweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FitController {
    public String dailyCals;

    @GetMapping("/")
    public String homePage(){
        return "macro_calculator";
    }

    @PostMapping("/mealPlan")
    public String mealPlanPost(@RequestParam(value = "dailyCalories")  String dailyCalories){
        System.out.println("Daily Calories: " + dailyCalories);
        dailyCals = dailyCalories;
        return "redirect:/mealPlan";
    }

    @GetMapping("/mealPlan")
    public String mealPlan(Model model){
        System.out.println("Daily Calories to meal plan: " + dailyCals);
        model.addAttribute("dailyCalories", dailyCals);
        return "mealPlan";
    }
}
