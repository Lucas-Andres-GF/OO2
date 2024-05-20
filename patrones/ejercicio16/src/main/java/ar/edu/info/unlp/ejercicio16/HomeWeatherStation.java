package ar.edu.info.unlp.ejercicio16;

import java.util.List;

public class HomeWeatherStation implements WeatherData {
  private double currentTemperature;
  private double atmosphericPressure;
  private double solarRadiation;
  private List<Double> temperatureHistory;

  public HomeWeatherStation(double currentTemperature, double atmosphericPressure, double solarRadiation,
      List<Double> temperatureHistory) {
    this.currentTemperature = currentTemperature;
    this.atmosphericPressure = atmosphericPressure;
    this.solarRadiation = solarRadiation;
    this.temperatureHistory = temperatureHistory;
  }

  public double getTemperatura() {
    return currentTemperature;
  }

  public double getPresion() {
    return atmosphericPressure;
  }

  public double getRadiacionSolar() {
    return solarRadiation;
  }

  public List<Double> getTemperaturas() {
    return temperatureHistory;
  }

  public String displayData() {
    return "Temperatura F: " + getTemperatura() + "; " +
        "Presion atmosf.: " + getPresion() + "; " +
        "Radiacion solar: " + getRadiacionSolar() + "; ";
  }
}