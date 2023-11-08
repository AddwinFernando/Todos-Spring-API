package com.addwin.spring.controller;

import com.addwin.spring.model.Todo;
import com.addwin.spring.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping("/all")
    public List<Todo> getAllTodos(){
        return todoRepository.getAllTodos();
    }

    @PostMapping("/add")
    public List<Todo> insertTodo(@RequestBody Todo todo){
        return todoRepository.insertTodo(todo);
    }
    @PostMapping("/edit")
    public List<Todo> editTodo(@RequestBody Todo todo){
        return  todoRepository.editTodo(todo);
    }

    @PostMapping("/delete")
    public List<Todo> deleteTodo(@RequestBody Todo todo){
        return  todoRepository.deleteTodo(todo);
    }

}
