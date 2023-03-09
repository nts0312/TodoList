package com.ntsProject.TodoList.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ntsProject.TodoList.todo.Todo;

@Service
public class TodoService {

	private static List<Todo> todolist = new ArrayList<>();

	static {
		todolist.add(new Todo(1, "ajay", "learning Swift", false, LocalDate.now().plusYears(1)));

		todolist.add(new Todo(2, "ajay", "learning Spring", true, LocalDate.now().plusYears(2)));

		todolist.add(new Todo(3, "ajay", "learning React", false, LocalDate.now().plusYears(3)));
	}

	public List<Todo> getList(String id) {

		return todolist;
	}
}
