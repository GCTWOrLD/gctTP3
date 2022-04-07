package com.gct.tp3.controllers;

import com.gct.tp3.service.BiblioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BiblioController {
    Logger logger = LoggerFactory.getLogger(BiblioController.class);

    private BiblioService service;

    public BiblioController(BiblioService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getRootRequest(Model model) {
        model.addAttribute("pageTitle", "Biblio");
        model.addAttribute("h1Text", "Biblio JavaTown");
        return "index";
    }
}
