package ar.edu.info.unlp.ejercicio16;

public class TemperatureCelsiusDecorator extends WeatherDecorator {

  public TemperatureCelsiusDecorator(WeatherData weatherData) {
    super(weatherData);
  }

  private double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) / 1.8;
  }

  

  @Override
  public String displayData() {
    return "Temperatura C: " + String.format("%,.2f", fahrenheitToCelsius(getTemperatura())) + "; " +
        "Presion atmosf.: " + getPresion() + "; " +
        "Radiacion solar: " + getRadiacionSolar() + "; ";
  }

}