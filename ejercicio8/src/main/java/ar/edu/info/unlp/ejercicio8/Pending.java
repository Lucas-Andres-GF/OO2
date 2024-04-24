package ar.edu.info.unlp.ejercicio8;

import java.util.List;
import java.time.Instant;

public class Pending extends ToDoItemState {

	@Override
	public void start(TodoItem context) {
		context.setStart(Instant.now());
		context.setStatus(new InProgress());
	}

	@Override
	public void togglePause(TodoItem context) {
		// nothing
	}

	@Override
	public void finish(TodoItem context) {
		// nothing
	}

	@Override
	public long workedTime(TodoItem context) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void addComments(List<String> comments, String comment) {
		comments.add(comment);
	}

}
