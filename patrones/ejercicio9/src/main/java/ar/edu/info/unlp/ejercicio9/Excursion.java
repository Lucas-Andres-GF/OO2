package ar.edu.info.unlp.ejercicio9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Excursion
 */
public class Excursion {
  private String name;
  private LocalDate startDate;
  private LocalDate endingDate;
  private String meetingPoint;
  private int minimumSlots;
  private int maximumSlots;
  private ExcursionState state;
  private List<User> users;
  private List<User> onHold;
  private double cost;

  public Excursion(
      String name,
      String meetingPoint,
      double cost,
      int minimumSlots,
      int maximumSlots,
      LocalDate startDate,
      LocalDate endingDate) {
    this.name = name;
    this.meetingPoint = meetingPoint;
    this.minimumSlots = minimumSlots;
    this.maximumSlots = maximumSlots;
    this.startDate = startDate;
    this.endingDate = endingDate;
    this.setState(new Provisional());
    this.users = new ArrayList<>();
    this.onHold = new ArrayList<>();
    this.cost = cost;
  }

  public void setState(ExcursionState state) {
    this.state = state;
  }

  public ExcursionState getState() {
    return state;
  }

  public void registerPerson(User user) {
    this.state.registerPerson(this, user);
  }

  public String aboutMe() {
    return this.state.aboutMe(this);
  }

  public int getMinimumSlots() {
    return minimumSlots;
  }

  public int getMaximumSlots() {
    return maximumSlots;
  }

  public String getName() {
    return name;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndingDate() {
    return endingDate;
  }

  public String getMeetingPoint() {
    return meetingPoint;
  }

  public List<User> getUsers() {
    return users;
  }

  public List<User> getOnHold() {
    return onHold;
  }

  public double getCost() {
    return this.cost;
  }
}