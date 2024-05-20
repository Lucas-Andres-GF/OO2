package ar.edu.info.unlp.ejercicio8;

import java.time.Instant;
import java.util.List;

public abstract class ToDoItemState {

  public ToDoItemState start(TodoItem context){
    throw new RuntimeException("El objeto ToDoItem no se encuentra en estado correcto");
  };

  public ToDoItemState togglePause(){
    throw new RuntimeException("El objeto ToDoItem no se encuentra en estado correcto");
  };

  public ToDoItemState finish(TodoItem context){
    throw new RuntimeException("El objeto ToDoItem no se encuentra en estado correcto");
  };

  public long workedTime(TodoItem context){
    return Instant.now().toEpochMilli() - context.getStartTime().toEpochMilli();
  };

  public void addComments(List<String> comments, String comment){
    comments.add(comment);
  }; 
}