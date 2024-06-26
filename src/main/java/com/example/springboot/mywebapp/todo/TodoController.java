package com.example.springboot.mywebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;
    public TodoController(TodoService todoService){
        super();
        this.todoService=todoService;
    }
    @RequestMapping("/list-todos")
    public String listTodos(ModelMap map){
        List<Todo> todos = todoService.findByUserName("kfozla");
        map.addAttribute("todos",todos);
        return "listTodos";
    }
}
