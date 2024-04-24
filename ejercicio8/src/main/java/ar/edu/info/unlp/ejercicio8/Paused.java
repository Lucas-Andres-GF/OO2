package ar.edu.info.unlp.ejercicio8;

import java.time.Instant;
import java.util.List;

public class Paused extends ToDoItemState {

	@Override
	public void start(TodoItem context) {
		// nothing
	}

	@Override
	public void togglePause(TodoItem context) {
		context.setStatus(new InProgress());
	}

	@Override
	public void finish(TodoItem context) {
		context.setFinishTime(Instant.now());
		context.setStatus(new Finished());
	}

	@Override
	public long workedTime(TodoItem context) {
		return Instant.now().toEpochMilli() - context.getStartTime().toEpochMilli();
	}

	@Override
	public void addComments(List<String> comments, String comment) {
		comments.add(comment);
	}

}
