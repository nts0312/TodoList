package com.ntsProject.TodoList.todo;

import java.time.LocalDate;

public class Todo {

	private int id;
	private String usernameString;
	private String description;
	private boolean isDone;
	private LocalDate targetDate;

	public Todo(int id, String usernameString, String description, boolean isDone, LocalDate targetDate) {
		super();
		this.id = id;
		this.usernameString = usernameString;
		this.description = description;
		this.isDone = isDone;
		this.targetDate = targetDate;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", usernameString=" + usernameString + ", description=" + description + ", isDone="
				+ isDone + ", targetDate=" + targetDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsernameString() {
		return usernameString;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

}
