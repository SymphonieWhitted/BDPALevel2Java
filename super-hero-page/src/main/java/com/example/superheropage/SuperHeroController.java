package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", " Batman");
        model.addAttribute("power1", "I can fly.");
        model.addAttribute("power2", "I have a sidekick named Robin.");
        model.addAttribute("power3", "I have a batmobile.");
        model.addAttribute("fact1", "I have a cool costume.");
        model.addAttribute("fact2", "I'm very smart");
        model.addAttribute("fact3", "I love to fight villians. ");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}
