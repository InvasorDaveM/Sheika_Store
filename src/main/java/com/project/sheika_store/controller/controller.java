package com.project.sheika_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/")
    public String logIn() {
        return "log_in";
    }

    // @RequestMapping("/")
    public String customerCreation() {
        return "customer_creation";
    }
}
