package com.example.test2.Controller;

import com.example.test2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private AccountService as;

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("table")
    public String accountTable(Model model){
        model.addAttribute("list",as.getTable());
        return "accountTable";
    }

}
