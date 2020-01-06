package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("var1", "Coding is fun.");
        model.addAttribute("var2", "Long live the Internet.");
        return "hometemplate";
    }
}
