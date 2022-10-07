package com.project.sheikah_store.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.sheikah_store.model.Account;
import com.project.sheikah_store.model.Customer;
import com.project.sheikah_store.model.Game;
import com.project.sheikah_store.repository.IAccountRepository;
import com.project.sheikah_store.repository.ICustomerRepository;
import com.project.sheikah_store.repository.IGameRepository;
import com.project.sheikah_store.service.AccountService;
import com.project.sheikah_store.service.CustomerService;
import com.project.sheikah_store.service.GameService;

@Controller
public class AppController {

    @Autowired
    private GameService gameService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AccountService accountService;
    // @Autowired
    // private IGameRepository iGameRepository;

    // private List<Game> gamesList = new ArrayList<>();

    public AppController(GameService gameService, IGameRepository iGameRepository, CustomerService customerService,
            ICustomerRepository iCustomerRepository, AccountService accountService,
            IAccountRepository iAccountRepository) {
        this.gameService = gameService;

        this.customerService = customerService;

        this.accountService = accountService;
    }

    /*
     * public AppController(CustomerService customerService, ICustomerRepository
     * iCustomerRepository) {
     * this.customerService = customerService;
     * 
     * // this.gamesList = this.iGameRepository.findAllGames();
     * }
     * 
     * public AppController(AccountService accountService, IAccountRepository
     * iAccountRepository) {
     * this.accountService = accountService;
     * 
     * // this.gamesList = this.iGameRepository.findAllGames();
     * }
     */

    @RequestMapping("/")
    public String logIn() {
        return "log_in";
    }

    @GetMapping("log_in.html")
    public String returnLogIn() {
        return "log_in";
    }

    @GetMapping("customer_creation.html")
    public String customerCreation() {
        return "customer_creation";
    }

    @GetMapping("customer_product_list.html")
    public String cutomerProductList(Model model) {
        model.addAttribute("games", gameService.getAllGames());
        return "customer_product_list";
    }

    @GetMapping("customer_order_list.html")
    public String cutomerOrderList(Model model) {
        model.addAttribute("games_connection", gameService.getAllGames());
        return "customer_order_list";
    }

    @PostMapping("customer_creation.html")
    public String insertCustomer(@ModelAttribute("customer_connection") Customer customerObject,
            @ModelAttribute("account_connection") Account accountObject) {
        customerService.insertCustomer(customerObject);
        accountService.insertAccount(accountObject);
        return "log_in";
    }

    /*
     * @PostMapping("customer_creation")
     * public String insertAccount(@ModelAttribute("account") Account account) {
     * accountService.insertAccount(account);
     * return "log_in";
     * }
     */

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
