package com.taskchamp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskManagerController {

	@RequestMapping("/asd")
	public String showTaskManager() {
		return "taskManager";
	}
}
