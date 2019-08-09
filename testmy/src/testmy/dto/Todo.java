package testmy.dto;

import java.util.Objects;

public class Todo {
	private int id;
	private String todo;
	private boolean done;

	public Todo() {
		this.done = false;
	}

	public String getTodo() {
		return todo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Todo todo = (Todo) o;
		return Objects.equals(id, todo.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
