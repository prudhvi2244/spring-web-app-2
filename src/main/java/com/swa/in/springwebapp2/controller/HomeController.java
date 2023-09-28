package com.swa.in.springwebapp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    /*
        http://localhost:8080/
     */
    @RequestMapping
    public String getWelcomePage(Model model){
        model.addAttribute("msg","Welcome to Spring MVC Application!");
        return "welcome";
    }

}
