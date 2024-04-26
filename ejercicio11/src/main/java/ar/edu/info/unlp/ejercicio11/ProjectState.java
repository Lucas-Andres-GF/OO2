package ar.edu.info.unlp.ejercicio11;

public abstract class ProjectState {
  public abstract void approveStage(Project project);

  public abstract void ModifyMarginOfGain(Project project, double marginOfGain);

  public void cancel(Project project) {
    project.setTarget("Cancelado");
    project.setState(new Canceled());
  }
}
