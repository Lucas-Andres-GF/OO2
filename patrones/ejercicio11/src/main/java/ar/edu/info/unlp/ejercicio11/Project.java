package ar.edu.info.unlp.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Project {
  private LocalDate startDate;
  private LocalDate endDate;
  private String target;
  private String name;
  private int numberOfMembers;
  private double salaryPerDay;
  private double marginOfGain;
  private ProjectState state;

  public Project(
      String name,
      LocalDate startDate,
      LocalDate endDate,
      String target,
      int numberOfMembers,
      double salaryPerDay,
      double marginOfGain) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.target = target;
    this.name = name;
    this.numberOfMembers = numberOfMembers;
    this.salaryPerDay = salaryPerDay;
    this.marginOfGain = 10;
    this.state = new InConstruction();
  }

  public void approveStage() {
    this.state.approveStage(this);
  }

  public void setState(ProjectState state) {
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public double getSalaryPerDay() {
    return salaryPerDay;
  }

  public String getTarget() {
    return target;
  }

  public int getNumberOfMembers() {
    return numberOfMembers;
  }

  public double getMarginOfGain() {
    return marginOfGain;
  }

  public ProjectState getState() {
    return state;
  }

  public long getDuration() {
    return ChronoUnit.DAYS.between(startDate, endDate);
  }

  public double getCost() {
    return (this.getNumberOfMembers() * this.getSalaryPerDay()) * this.getDuration();
  }

  public double getPrice() {
    return this.getCost() / ((100 - this.getMarginOfGain()) / 100);
  }

  public void ModifyMarginOfGain(double newMarginOfGain) {
    this.state.ModifyMarginOfGain(this, newMarginOfGain);
  }

  public void setMarginOfGain(double marginOfGain) {
    this.marginOfGain = marginOfGain;
  }

  public void cancel() {
    this.state.cancel(this);
  }

  public void setTarget(String target) {
    this.target = target;
  }

}
