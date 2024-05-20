package ar.edu.info.unlp.ejercicio11;

/**
 * InConstruction
 */
public class InConstruction extends ProjectState {
  InConstruction() {

  }

  @Override
  public void approveStage(Project project) {
    if (project.getPrice() > 0) {
      project.setState(new InEvaluation());
    } else {
      throw new RuntimeException("El precio del proyecto debe ser mayor a 0");
    }
  }

  @Override
  public void ModifyMarginOfGain(Project project, double marginOfGain) {
    if (project.getMarginOfGain() >= 8 && project.getMarginOfGain() <= 10) {
      project.setMarginOfGain(marginOfGain);
    }
  }
}