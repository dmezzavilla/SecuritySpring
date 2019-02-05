package com.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Daniel Mezzavilla
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView auth() {
        return new ModelAndView("auth-log-in");
    }

    @GetMapping(value = "index")
    public ModelAndView index() {

        return new ModelAndView("index");
    }
}
