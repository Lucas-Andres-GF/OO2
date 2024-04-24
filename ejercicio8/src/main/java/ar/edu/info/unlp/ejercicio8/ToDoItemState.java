package ar.edu.info.unlp.ejercicio8;

import java.util.List;

public abstract class ToDoItemState {
  public abstract void start(TodoItem context);

  public abstract void togglePause(TodoItem context);

  public abstract void finish(TodoItem context);

  public abstract long workedTime(TodoItem context);

  public abstract void addComments(List<String> comments, String comment);
}