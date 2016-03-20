package com.taskchamp.web.domain;

public class Task {
	private int id;
	private String taskId;
	private String title;
	private String details;
	private boolean taskComplete;

	public Task() {

	}

	public Task(String taskId, String title, String details,
			boolean taskComplete) {
		this.taskId = taskId;
		this.title = title;
		this.title = title;
		this.taskComplete = taskComplete;
	}

	public Task(int id, String taskId, String title, String details,
			boolean taskComplete) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.title = title;
		this.title = title;
		this.taskComplete = taskComplete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
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
		return "Tasks [id=" + id + ", taskId=" + taskId + ", title=" + title
				+ ", details=" + details + ", taskComplete=" + taskComplete
				+ "]";
	}

}
