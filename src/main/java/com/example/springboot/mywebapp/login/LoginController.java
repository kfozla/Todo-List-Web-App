package com.example.springboot.mywebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/login")
    public String  loginPage(){

        return "login";
    }
}
