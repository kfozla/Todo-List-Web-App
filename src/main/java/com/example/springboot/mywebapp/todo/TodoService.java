package com.example.springboot.mywebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos=new ArrayList<>();
    private static int todosCount=0;
    static {
        todos.add(new Todo(++todosCount,"kfozla","learn AWS",
                LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todosCount,"kfozla","learn DevOps",
                LocalDate.now().plusYears(2),false));
        todos.add(new Todo(++todosCount,"kfozla","learn React",
                LocalDate.now().plusYears(3),false));
    }
    public List<Todo> findByUserName(String userName){
        return todos;
    }
    public void AddTodo(String userName,String description,LocalDate targetDate,Boolean isItDone){
        Todo todo=new Todo(++todosCount,userName,description,targetDate,isItDone);
        todos.add(todo);

    }
    public void deleteById(int id){
        Predicate<? super Todo> predicate= todo -> todo.getId()==id;
        todos.removeIf(predicate);
    }
}
