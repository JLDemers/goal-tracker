package com.taskchamp.web.domain;

import javax.validation.constraints.Size;

public class Task {
	private int id;
	private String token;
	
	@Size(min=1, max=100, message="Title must be between 1 and 100 characters.")
	private String title;
	
	@Size(min=1, max=255, message="Details must be bewteen 1 and 255 characters.")
	private String details;
	private boolean taskComplete;

	public Task() {

	}

	public Task(String token, String title, String details, boolean taskComplete) {
		this.token = token;
		this.title = title;
		this.details = details;
		this.taskComplete = taskComplete;
	}

	public Task(int id, String token, String title, String details, boolean taskComplete) {
		super();
		this.id = id;
		this.token = token;
		this.title = title;
		this.details = details;
		this.taskComplete = taskComplete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public boolean isTaskComplete() {
		return taskComplete;
	}

	public void setTaskComplete(boolean taskComplete) {
		this.taskComplete = taskComplete;
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", token=" + token + ", title=" + title
				+ ", details=" + details + ", taskComplete=" + taskComplete
				+ "]";
	}

}
