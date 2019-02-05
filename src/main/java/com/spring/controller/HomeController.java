package com.spring.controller;


import com.spring.entity.User;
import com.spring.entity.UserRole;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/")
public class HomeController {

    private final UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("addroot")
    public String addroot() {
        User userFind = userService.findUserByEmail("root@mezzavilla.com.br");
        if (userFind == null) {
            // Inserindo usuário padrão
            User rootUser = new User();
            rootUser.setName("Daniel");
            rootUser.setSurname("Mezzavilla");
            rootUser.setEmail("root@mezzavilla.com.br");
            rootUser.setPassword("root");
            rootUser.setTelefone("3333-3333");
            rootUser.setUserRole(UserRole.ADMIN);
            rootUser.setActive(true);

            rootUser.setUltimoLogin(new Date());

            userService.save(rootUser);
            return "auth-log-in";
        }
        return "auth-log-in";
    }

    @GetMapping("adduser")
    public String adduser() {
        User userFind = userService.findUserByEmail("user@mezzavilla.com.br");
        if (userFind == null) {
            // Inserindo usuário padrão
            User userUser = new User();
            userUser.setName("Daniel");
            userUser.setSurname("Mezzavilla");
            userUser.setEmail("user@mezzavilla.com.br");
            userUser.setPassword("root");
            userUser.setTelefone("3333-3333");
            userUser.setUserRole(UserRole.USER);
            userUser.setActive(true);
            userUser.setUltimoLogin(new Date());

            userService.save(userUser);
            return "auth-log-in";
        }
        return "auth-log-in";
    }

    @GetMapping
    public ModelAndView auth() {
        return new ModelAndView("auth-log-in");
    }

    @GetMapping(value = "index")
    public ModelAndView index() {

        return new ModelAndView("index");
    }
}
