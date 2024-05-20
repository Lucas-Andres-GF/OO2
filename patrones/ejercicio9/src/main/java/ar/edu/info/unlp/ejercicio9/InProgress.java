package ar.edu.info.unlp.ejercicio9;

public class InProgress extends ExcursionState {

  public InProgress() {

  }

  @Override
  public void registerPerson(Excursion excursion, User user) {
    if (excursion.getUsers().size() + 1 <= excursion.getMaximumSlots()) {
      excursion.getUsers().add(user);
      if (excursion.getUsers().size() == excursion.getMaximumSlots()) {
        excursion.setState(new SoldOut());
      }
    }
  }

  @Override
  public String aboutMe(Excursion excursion) {
    String emails = "";
    for (User u : excursion.getUsers()) {
      emails += u.getEmail() + "\n";
    }

    return "Nobre: " + excursion.getName() + "\n" + "Costo: $" + excursion.getCost() + "\n" + "Inicio: "
        + excursion.getStartDate() + "\n" + "Fin: " + excursion.getEndingDate() + "\n" + "Punto de encuentro: "
        + excursion.getMeetingPoint() + "\n"
        + "Email de los viajeros: \n" + emails
        + "Lugares disponibles: " + (excursion.getMaximumSlots() - excursion.getUsers().size())
        + "\n";
  }

}
