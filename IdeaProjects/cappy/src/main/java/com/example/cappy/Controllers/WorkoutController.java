package com.example.cappy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "/home/workout")
public class WorkoutController {

    static ArrayList<String> lifts = new ArrayList<>();
    @RequestMapping("")
    public String index (Model model){

        model.addAttribute("lifts", lifts);
        model.addAttribute("Title", "Build a workout");
        return "workout/workout";
}
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddWorkoutForm(Model model){
        model.addAttribute("title", "Add Workout");
        return "workout/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWorkoutForm(@RequestParam String liftName){
        lifts.add(liftName);
        return"redirect:";


    }
}

