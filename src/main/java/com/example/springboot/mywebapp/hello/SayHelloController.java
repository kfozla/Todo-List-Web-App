package com.example.springboot.mywebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public String hello(){
        return "Hello! What are you doing?";
    }
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String helloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My Html Page </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My Html Page body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
    @RequestMapping("say-hello-jsp")
    public String helloJSP(){
        return "sayHello";
    }

}
