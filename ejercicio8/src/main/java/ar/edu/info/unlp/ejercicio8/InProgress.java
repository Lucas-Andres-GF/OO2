package ar.edu.info.unlp.ejercicio8;

import java.time.Instant;

public class InProgress extends ToDoItemState {

  @Override
  public ToDoItemState togglePause() {
    return new Paused();
  }

  @Override
  public ToDoItemState finish(TodoItem context) {
    context.setFinishTime(Instant.now());
    return new Finished();
  }


}
