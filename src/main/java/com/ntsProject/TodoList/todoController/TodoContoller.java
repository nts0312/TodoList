package com.ntsProject.TodoList.todoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ntsProject.TodoList.todo.Todo;
import com.ntsProject.TodoList.todo.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoContoller {

	@Autowired
	private TodoService todoService;

	@GetMapping("list-todos")
	public String showTodoList(ModelMap model) {
		List<Todo> todos = todoService.getList("nitin");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
}
