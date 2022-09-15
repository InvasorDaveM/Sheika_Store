package com.project.sheikah_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/")
    public String logIn() {
        return "log_in";
    }

    @GetMapping("customer_creation.html")
    public String customerCreation() {
        return "customer_creation";
    }

    @GetMapping("log_in.html")
    public String returnLogIn() {
        return "log_in";
    }

    @GetMapping("customer_product_list.html")
    public String cutomerProductList() {
        return "customer_product_list";
    }

    @GetMapping("customer_order_list.html")
    public String cutomerIrderList() {
        return "customer_order_list";
    }

}
