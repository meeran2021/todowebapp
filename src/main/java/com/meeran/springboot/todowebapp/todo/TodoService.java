package com.meeran.springboot.todowebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 0;

	static {
		todos.add(new Todo(++todoCount, "meeran2001", "Learn AWS 1", LocalDate.now().plusMonths(1), false));
		todos.add(new Todo(++todoCount, "meeran2001", "Learn Node.js with meeran", LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(++todoCount, "meeran2001", "Learn Kafka", LocalDate.now().plusMonths(5), false));
		todos.add(new Todo(++todoCount, "meeran2001", "Learn DevOps", LocalDate.now().plusMonths(6), false));
	}

	public List<Todo> findByUsername(String username) {
		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);

		return todos.stream().filter(predicate).toList();
	}

	public void addNewTodo(String username, String description, LocalDate targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, username, description, targetDate, isDone));
	}

	public void deleteTodoById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findTodoById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteTodoById(todo.getId());
		todos.add(todo);
	}
}
