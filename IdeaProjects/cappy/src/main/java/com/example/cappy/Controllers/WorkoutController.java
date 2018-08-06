package com.example.cappy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WorkoutController {
    @GetMapping("/home/workout")
    public String home(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "workout";
}}
