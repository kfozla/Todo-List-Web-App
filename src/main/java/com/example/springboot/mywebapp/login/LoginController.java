package com.example.springboot.mywebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value ="/login",method = RequestMethod.GET)
    public String  loginPageGet(){

        return "login";
    }
    @RequestMapping(value ="/login",method = RequestMethod.POST)
    public String  loginPagePost(@RequestParam String name, @RequestParam String password, ModelMap modelmap){
        modelmap.put("name",name);
        modelmap.put("password",password);

        return "welcome";
    }
}
