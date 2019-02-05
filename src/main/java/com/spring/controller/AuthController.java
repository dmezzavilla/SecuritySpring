package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping
    public String login1() {
        return "auth-log-in";
    }

    @GetMapping(value = "/login")
    public ModelAndView login(@RequestParam(value = "error", required = false) boolean error,
                              @RequestParam(value = "logout", required = false) boolean logout, ModelMap model) {

        if (error) {
            model.addAttribute("error", "Nome de usuário ou senha inválidos!");
            return new ModelAndView("auth-log-in", model);
        }

        if (logout) {
            model.addAttribute("logout", "Você foi deslogado com sucesso!");
            return new ModelAndView("logout");
        }

        return new ModelAndView("redirect:/");
    }

    @GetMapping(value = "/denied")
    public ModelAndView accessDenied() {
        return new ModelAndView("405");
    }


}
