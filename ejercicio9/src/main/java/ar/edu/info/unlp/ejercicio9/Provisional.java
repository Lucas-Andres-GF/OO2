package ar.edu.info.unlp.ejercicio9;

public class Provisional extends ExcursionState {
  public Provisional() {

  }

  @Override
  public void registerPerson(Excursion excursion, User user) {
    if (excursion.getUsers().size() + 1 <= excursion.getMinimumSlots()) {
      excursion.getUsers().add(user);
      if (excursion.getUsers().size() == excursion.getMinimumSlots()) {
        excursion.setState(new InProgress());
      }
    }
  }

  @Override
  public String aboutMe(Excursion excursion) {
    return "Nobre: " + excursion.getName() + "\n" + "Costo: $" + excursion.getCost() + "\n" + "Inicio: "
        + excursion.getStartDate() + "\n" + "Fin: " + excursion.getEndingDate() + "\n" + "Punto de encuentro: "
        + excursion.getMeetingPoint() + "\n" + "Lugares disponibles: "
        + (excursion.getMinimumSlots() - excursion.getUsers().size())
        + "\n";
  }

}
