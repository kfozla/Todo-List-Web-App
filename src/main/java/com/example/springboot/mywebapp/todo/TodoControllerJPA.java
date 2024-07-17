package com.example.springboot.mywebapp.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoControllerJPA {
    private TodoRepository todoRepository;
    public TodoControllerJPA(TodoService todoService,TodoRepository todoRepository){
        super();
        this.todoRepository=todoRepository;
    }
    @RequestMapping("/list-todos")
    public String listTodos(ModelMap map){
        List<Todo> todos = todoRepository.findByUserName(getLoggedInUserName(map));
        map.addAttribute("todos",todos);
        return "listTodos";
    }
    @RequestMapping(value = "/add-todo",method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model){
        Todo todo =new Todo(0,getLoggedInUserName(model),"",LocalDate.now().plusYears(1),false);
        model.put("todo",todo);
        return "todo";
    }
    @RequestMapping(value = "/add-todo",method = RequestMethod.POST)
    public String addNewTodoPage(ModelMap model, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        todo.setUserName(getLoggedInUserName(model));
        todoRepository.save(todo);
        return "redirect:list-todos";
    }
    @RequestMapping("/delete-todo")
    public String deleteTodo(@RequestParam int id){
        todoRepository.deleteById(id);
        return "redirect:list-todos";
    }
    @RequestMapping("/update-todo")
    public String updateTodoPage(@RequestParam int id, ModelMap model){
        Todo todo =todoRepository.findById(id).get();
        model.put("todo",todo);
        return "todo";
    }
    @RequestMapping(value = "/update-todo",method = RequestMethod.POST)
    public String updateTodoBtn(@Valid Todo todo,BindingResult result,ModelMap model){
        if (result.hasErrors()){
            return "todo";
        }
        todo.setUserName(getLoggedInUserName(model));
       //todoService.updateTodo(todo);
        todoRepository.save(todo);
        return "redirect:list-todos";
    }

    private String getLoggedInUserName(ModelMap model){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
