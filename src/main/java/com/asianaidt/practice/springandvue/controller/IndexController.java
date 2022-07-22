package com.asianaidt.practice.springandvue.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model, Principal principal) {
        log.info("index");
        if (principal == null) {
            model.addAttribute("message", "Hello Spring Security");
        } else {
            model. addAttribute("message", "Hello " + principal.getName());
        }
        System.out.println("model.toString() = " + model);
        return "index";
    }

    @GetMapping("/info")
    public String info(Model model) {
        log.info("info");
        model.addAttribute("message", "info");
        System.out.println("model.toString() = " + model);
        return "info";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, Principal principal) {
        log.info("dashboard");
        model.addAttribute("message", "Hello" + principal.getName());
        System.out.println("model.toString() = " + model);
        return "dashboard";
    }

    @GetMapping("/admin")
    public String admin(Model model, Principal principal) {
        log.info("admin");
        model.addAttribute("message", "hello Admin, " + principal.getName());
        System.out.println("model.toString() = " + model);
        return "admin";
    }
}
