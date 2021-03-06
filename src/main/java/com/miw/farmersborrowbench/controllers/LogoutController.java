package com.miw.farmersborrowbench.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping("/goToLogout")
    public String logout(HttpSession session){
        System.out.println("Ending user session");
        session.invalidate();
        return "logout";
    }
}
