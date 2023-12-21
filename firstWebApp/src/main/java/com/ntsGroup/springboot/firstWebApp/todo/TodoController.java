package com.ntsGroup.springboot.firstWebApp.todo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoservice;

	@RequestMapping("list-todos")
	public String listAllTodos( ModelMap model) {
		
		List<Todo> todos = todoservice.findByUsername("");
		
		
		model.put("todos", todos);
		return "listTodos";
	}
	
	@GetMapping("add-todo")
	public String showNewTodoPage(ModelMap model) {
		model.put("todo", new Todo(0,(String)model.get("name"),"",LocalDate.now().plusYears(1), false));
		return "todo";
	}
	
	@PostMapping("add-todo")
	public String addNewTodo( ModelMap model, @Valid Todo todo, BindingResult result) { //@Valid and @Size or other annotation should be used together and binding result is to show result only is validation is not successful
		
		if (result.hasErrors()) {
			return "todo";
		} 
	
		todoservice.addTodo((String)model.get("name"), todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		//delete todo
		todoservice.deleteById(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping("update-todo")
	public String showUpdateTodoPage(@RequestParam int id ,ModelMap model) {
		Todo todo = todoservice.findById(id);
		model.addAttribute("todo", todo);
		return "todo";
	}
	
	
	@PostMapping("update-todo")
	public String updateTodo( ModelMap model, @Valid Todo todo, BindingResult result) { //@Valid and @Size or other annotation should be used together and binding result is to show result only is validation is not successful
		
		if (result.hasErrors()) {
			return "todo";
		} 
		todoservice.updateTodo(todo);
		return "redirect:list-todos";
	}

}
