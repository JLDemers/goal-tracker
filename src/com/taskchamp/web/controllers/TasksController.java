package com.taskchamp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TasksController {
	
	@RequestMapping("/asd1")
	public String showTasks() {
		return "tasks";
	}
}