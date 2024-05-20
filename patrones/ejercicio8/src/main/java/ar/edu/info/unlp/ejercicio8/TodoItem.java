package ar.edu.info.unlp.ejercicio8;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TodoItem {
  private String name;
  private List<String> comments;
  private ToDoItemState state;
  private Instant startTime;
  private Instant finishTime;

  public TodoItem(String name) {
    this.name = name;
    comments = new ArrayList<>();
    state = new Pending();
  }

  public void addComment(String comment) {
    this.state.addComments(this.comments, comment);
  }

  public void start() {
    this.state = state.start(this);
  }

  public void togglePause() {
    this.state = state.togglePause();
  }

  public void finish() {
    this.state = state.finish(this);
  }

  public long workedTime() { // HACERLO CON DURATIONNNN"""!!!
    return this.state.workedTime(this);
  }

  public List<String> getComments() {
    return this.comments;
  }

  public void setStatus(ToDoItemState newState) {
    this.state = newState;
  }

  public void setStart(Instant startTime) {
    this.startTime = startTime;
  }

  public void setFinishTime(Instant finishTime) {
    this.finishTime = finishTime;
  }

  public Instant getStartTime() {
    return this.startTime;
  }

  public Instant getFinishTime() {
    return this.finishTime;
  }

  public String getName() {
    return this.name;
  }

  public ToDoItemState getState() {
    return this.state;
  }
}
