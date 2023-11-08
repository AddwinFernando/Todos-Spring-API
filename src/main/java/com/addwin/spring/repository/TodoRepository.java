package com.addwin.spring.repository;

import com.addwin.spring.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TodoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Todo> getAllTodos() {
        return jdbcTemplate.query("SELECT * FROM todos",new BeanPropertyRowMapper<>(Todo.class));
    }

    public List<Todo> deleteTodo(Todo todo) {
        jdbcTemplate.update("DELETE FROM todos WHERE id=?",new Object[]{todo.getId()});
        return getAllTodos();
    }

    public List<Todo> editTodo(Todo todo) {
        jdbcTemplate.update("UPDATE todos SET todo=? WHERE id=?",new Object[]{todo.getTodo(),todo.getId()});
        return getAllTodos();
    }

    public List<Todo> insertTodo(Todo todo) {
        jdbcTemplate.update("INSERT INTO todos (id,todo) VALUES (?,?)",new Object[]{todo.getId(),todo.getTodo()});
        return getAllTodos();
    }
}
