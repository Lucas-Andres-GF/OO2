package ar.edu.info.unlp.ejercicio16;

import java.util.List;
import java.util.stream.Collectors;

public class TemperaturaMaxAndMinDecorator extends WeatherDecorator {

  public TemperaturaMaxAndMinDecorator(WeatherData weatherData) {
    super(weatherData);
  }

  @Override
  public String displayData() {
    List<Double> temperatures = this.weatherData.getTemperaturas().stream().sorted().collect(Collectors.toList());
    if (temperatures.isEmpty()) {
      return super.displayData() + "La Lista se encuentra vacia";
    }
    return super.displayData() + "Minimo: " + temperatures.get(0) + " Maximo: "
        + temperatures.get(temperatures.size() - 1) + "; ";
  }

}
