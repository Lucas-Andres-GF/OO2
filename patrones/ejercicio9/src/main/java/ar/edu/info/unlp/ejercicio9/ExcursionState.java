package ar.edu.info.unlp.ejercicio9;

public abstract class ExcursionState {
  public abstract void registerPerson(Excursion excursion, User user);

  public abstract String aboutMe(Excursion excursion);
}
