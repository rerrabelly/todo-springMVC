package com.in28minutes.todo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.model.Todo;
import com.in28minutes.todo.service.TodoService;

@RestController
public class TodoRestController {

	@Autowired
	TodoService service;
	
	@RequestMapping(path="/todos")
	public List<Todo> retrieveAllTodos()
	{
		return service.retrieveTodos("in28Minutes");
	}
	
	@RequestMapping(path="/todos/{id}")
	public Todo retrieveTodo(@PathVariable int id)
	{
		return service.retrieveTodo(id);
	}
	
	
}
