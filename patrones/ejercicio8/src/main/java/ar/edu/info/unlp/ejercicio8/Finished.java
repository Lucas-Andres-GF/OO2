package ar.edu.info.unlp.ejercicio8;

import java.util.List;

public class Finished extends ToDoItemState {

	@Override
	public long workedTime(TodoItem context) {
		return context.getFinishTime().toEpochMilli() - context.getStartTime().toEpochMilli();
	}

	@Override
	public void addComments(List<String> comments, String comment) {
		throw new RuntimeException("No se pueden agregar comentarios a una tarea finalizada");
	}

}
