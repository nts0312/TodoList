package com.ntsGroup.springboot.firstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import java.util.function.Predicate;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();

	private static int todosCount = 0;

	static {
		todos.add(new Todo(++todosCount, "Harry", "magical boy", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Tom", "cate mouse", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "John", "actor boy", LocalDate.now().plusYears(2), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;

	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {

		todos.add(new Todo(++todosCount, username, description, targetDate, done));
	}

	public void deleteById(int id) {
		Predicate<Todo> byId = todo -> todo.getId() == id;
		todos.removeIf(byId);
	}

	public Todo findById(int id) {
		
		Predicate<Todo> byId = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(byId).findFirst().get();		
		return todo;
	}

	public void updateTodo(Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
		
	}

}
