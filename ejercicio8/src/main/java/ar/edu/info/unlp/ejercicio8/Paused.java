package ar.edu.info.unlp.ejercicio8;

import java.time.Instant;

public class Paused extends ToDoItemState {

	@Override
	public ToDoItemState togglePause() {
	  return new InProgress();
	}

	@Override
	public ToDoItemState finish(TodoItem context) {
		context.setFinishTime(Instant.now());
		return new Finished();
	}

}
