package com.taskchamp.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskchamp.web.dao.TaskDAO;
import com.taskchamp.web.domain.Task;

@Service("taskService")
public class TaskService {
	
	private TaskDAO taskDao;
	
	@Autowired
	public void setTaskDao(TaskDAO taskDao) {
		this.taskDao = taskDao;
	}



	public List<Task> getAllTasks() {
		return taskDao.getAllTasks();
	}
	
}
