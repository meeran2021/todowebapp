package com.meeran.springboot.todowebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

//@Controller
@SessionAttributes("username")
public class TodoController {
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping(value = "todo-list")
	public String listAllTodos(ModelMap model) {
		String username= getLoggedInUsername(model);
		List<Todo> todos = todoService.findByUsername(username);
		model.addAttribute("todos", todos);
		return "TodoList";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		String username= getLoggedInUsername(model);
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "AddTodo";
	}

	
	@RequestMapping(value = "add-todo", method= RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "AddTodo";
		}
		
		String username= getLoggedInUsername(model);
		todoService.addNewTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:todo-list";
	}
	
	@RequestMapping(value = "delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteTodoById(id);
		return "redirect:todo-list";
	}

	@RequestMapping(value = "update-todo", method=RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.findTodoById(id);
		model.addAttribute("todo", todo);
		return "AddTodo";
	}
	
	@RequestMapping(value = "update-todo", method=RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "AddTodo";
		}
		
		String username= getLoggedInUsername(model);
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:todo-list";
	}

	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
