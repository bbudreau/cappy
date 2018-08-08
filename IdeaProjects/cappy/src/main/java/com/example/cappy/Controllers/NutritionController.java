package com.example.cappy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
@Controller
@RequestMapping(value = "/home/nutrition")
public class NutritionController {
    static ArrayList<String> foods = new ArrayList<>();
    @RequestMapping(value = "")
    public String index (Model model){
        model.addAttribute("foods", foods);
        model.addAttribute("title", "Track your Calories");
        return "/nutrition/nutrition";
    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddWorkoutForm(Model model){
        model.addAttribute("title", "Add Food");
        return "nutrition/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWorkoutForm(@RequestParam String foodName) {
        foods.add(foodName);
        return "redirect:";
    }
}
