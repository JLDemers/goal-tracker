package com.taskchamp.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taskchamp.web.domain.Task;
import com.taskchamp.web.service.TaskService;

@Controller
public class TasksController {
	
	private TaskService taskService;

	@Autowired
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@RequestMapping("/tasks")
	public String showTasks(Model model) {
		
		List<Task> task = taskService.getAllTasks();

		model.addAttribute("task", task);
		
		return "tasks";
	}
	
	@RequestMapping("/createtask")
	public String createTask(Model model) {
		model.addAttribute("task", new Task());		
		
		return "createtask";
	}
	
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Task task, BindingResult result) {
		
		if(result.hasErrors()){
			return "createtask";
		}
		
		return showTasks(model);
	}
}
