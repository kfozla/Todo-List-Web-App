package com.example.springboot.mywebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class TodoService {
    private static List<Todo> todos=new ArrayList<>();
    static {
        todos.add(new Todo(1,"kfozla","learn AWS",
                LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1,"kfozla","learn DevOps",
                LocalDate.now().plusYears(2),false));
        todos.add(new Todo(1,"kfozla","learn React",
                LocalDate.now().plusYears(3),false));
    }
    public List<Todo> findByUserName(String userName){
        return todos;
    }
}
