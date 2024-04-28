package ar.edu.info.unlp.ejercicio16;

public class TemperatureAverageDecorator extends WeatherDecorator {

  public TemperatureAverageDecorator(WeatherData weatherData) {
    super(weatherData);
  }

  private double getAverageTemperature() {
    if (this.weatherData.getTemperaturas().isEmpty()) {
      return 0.0;
    }
    double sum = this.weatherData.getTemperaturas().stream().mapToDouble(Double::doubleValue).sum();
    return sum / this.weatherData.getTemperaturas().size();
  }

  @Override
  public String displayData() {
    return super.displayData() + "Temperatura promedio: " + getAverageTemperature() + "; ";
  }

}
