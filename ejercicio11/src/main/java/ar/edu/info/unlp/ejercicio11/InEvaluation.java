package ar.edu.info.unlp.ejercicio11;

public class InEvaluation extends ProjectState {
  public InEvaluation() {

  }

  @Override
  public void approveStage(Project project) {
    project.setState(new Confirmed());
  }

  @Override
  public void ModifyMarginOfGain(Project project, double marginOfGain) {
    if (project.getMarginOfGain() >= 11 && project.getMarginOfGain() <= 15) {
      project.setMarginOfGain(marginOfGain);
    }
  }

}
