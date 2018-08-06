package com.example.cappy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
public class HomeController {
    // Request path: /home
    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("title", "My Fitness Project");
        return "home/index";
    }

}
