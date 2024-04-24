package ar.edu.info.unlp.ejercicio8;

import java.util.List;

public class Finished extends ToDoItemState {

	@Override
	public void start(TodoItem context) {
		// nothing
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
		return context.getFinishTime().toEpochMilli() - context.getStartTime().toEpochMilli();
	}

	@Override
	public void addComments(List<String> comments, String comment) {
		// nothing
	}

}
