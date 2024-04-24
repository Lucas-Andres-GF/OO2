package ar.edu.info.unlp.ejercicio9;

public class SoldOut extends ExcursionState {

  public SoldOut() {

  }

  @Override
  public void registerPerson(Excursion excursion, User user) {
    excursion.getOnHold().add(user);
  }

  @Override
  public String aboutMe(Excursion excursion) {
    return "Nobre: " + excursion.getName() + "\n" + "Costo: $" + excursion.getCost() + "\n" + "Inicio: "
        + excursion.getStartDate() + "\n" + "Fin: " + excursion.getEndingDate() + "\n" + "Punto de encuentro: "
        + excursion.getMeetingPoint() + "\n";
  }

}
