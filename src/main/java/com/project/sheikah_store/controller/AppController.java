package com.project.sheikah_store.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.sheikah_store.model.Game;
import com.project.sheikah_store.repository.IGameRepository;
import com.project.sheikah_store.service.GameService;

@Controller
public class AppController {

    @Autowired
    private GameService gameService;

    // @Autowired
    // private IGameRepository iGameRepository;

    // private List<Game> gamesList = new ArrayList<>();

    public AppController(GameService gameService, IGameRepository iGameRepository) {
        this.gameService = gameService;

        // this.gamesList = this.iGameRepository.findAllGames();
    }

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
    public String cutomerProductList(Model model) {
        model.addAttribute("games", gameService.getAllGames());
        return "customer_product_list";
    }

    @GetMapping("customer_order_list.html")
    public String cutomerOrderList() {
        return "customer_order_list";
    }

    /*
     * private final GameService gameService;
     * 
     * public AppController(GameService gameService) {
     * this.gameService = gameService;
     * }
     * 
     * @RequestMapping("/")
     * /*
     * public String logIn() {
     * return "log_in";
     * }
     * 
     * @GetMapping("customer_creation.html")
     * public String customerCreation() {
     * return "customer_creation";
     * }
     * 
     * @GetMapping("log_in.html")
     * public String returnLogIn() {
     * return "log_in";
     * }
     * 
     * @GetMapping("customer_product_list.html")
     * 
     * public String cutomerProductList(Model model) {
     * List<Game> list = gameService.gameList();
     * model.addAttribute("games", list);
     * return "customer_product_list";
     * }
     * 
     * @GetMapping("customer_order_list.html")
     * public String cutomerOrderList() {
     * return "customer_order_list";
     * }
     */
}
