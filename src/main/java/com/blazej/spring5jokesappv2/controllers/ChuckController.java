package com.blazej.spring5jokesappv2.controllers;

import com.blazej.spring5jokesappv2.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckController {
    private final ChuckNorrisJokeService service;

    public ChuckController(ChuckNorrisJokeService service) {
        this.service = service;
    }
    @RequestMapping(path = "/")
    public String getJoke(Model model) {
        model.addAttribute("joke", service.getRandomQuote());
        return "index";
    }
}
