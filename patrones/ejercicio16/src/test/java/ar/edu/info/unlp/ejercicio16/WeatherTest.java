package ar.edu.info.unlp.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherTest {

  HomeWeatherStation homeWeatherStation;
  List<Double> temperatures;

  @BeforeEach
  void setUp() throws Exception {
    temperatures = new ArrayList<>();
    for (int i = 0; i < 45; i++) {
      Random random = new Random();
      double temperature = 32.0 + random.nextDouble() * (100.0 - 32.0); // Temperatura en Fahrenheit entre 32.0 y 100.
      temperatures.add(temperature);
    }
    homeWeatherStation = new HomeWeatherStation(56, 1006.1, 200, List.of(56.0, 57.0, 58.0));
  }

  @Test
  public void testDisplayData() {
    System.out.println(homeWeatherStation.displayData());
    assertEquals("Temperatura F: 56.0; Presion atmosf.: 1006.1; Radiacion solar: 200.0;",
        homeWeatherStation.displayData());
  }

  @Test
  public void testTemperatureCelsiusDecorator() {
    TemperatureCelsiusDecorator temperatureCelsiusDecorator = new TemperatureCelsiusDecorator(homeWeatherStation);
    System.out.println(temperatureCelsiusDecorator.displayData());
    assertEquals("Temperatura C: 13.33; Presion atmosf.: 1006.1; Radiacion solar: 200.0;",
        temperatureCelsiusDecorator.displayData());
  }

  @Test
  public void testTemperaturaAverage() {
    // TemperatureCelsiusDecorator temperatureCelsiusDecorator = new
    // TemperatureCelsiusDecorator(homeWeatherStation);
    TemperatureAverageDecorator temperatureAverageDecorator = new TemperatureAverageDecorator(
        homeWeatherStation);
    System.out.println(temperatureAverageDecorator.displayData());
  }

  @Test
  public void testTemperaturaMinAndMax() {
    TemperatureCelsiusDecorator temperatureCelsiusDecorator = new TemperatureCelsiusDecorator(homeWeatherStation);
    TemperaturaMaxAndMinDecorator temperatureMinAndMaxDecorator = new TemperaturaMaxAndMinDecorator(
        temperatureCelsiusDecorator);
    TemperatureAverageDecorator temperatureAverageDecorator = new TemperatureAverageDecorator(
        temperatureMinAndMaxDecorator);
    System.out.println(temperatureAverageDecorator.displayData());
  }

}
