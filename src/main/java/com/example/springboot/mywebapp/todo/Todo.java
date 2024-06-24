package com.example.springboot.mywebapp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String userName;
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public Todo(int id, String userName, String description, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }
    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
