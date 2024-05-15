package ar.edu.info.unlp.ejercicio8;

import java.time.Instant;

public class Pending extends ToDoItemState {

	@Override
	public ToDoItemState start(TodoItem context) {
		context.setStart(Instant.now());
		return new InProgress(); 
	}

	@Override
	public long workedTime(TodoItem context) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

}
