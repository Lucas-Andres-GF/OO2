Ejercicio 16 - Estación meteorológica

Sea una estación meteorológica hogareña que permite conocer información de varios aspectos del clima. Esta estación está implementada con la clase HomeWeatherStation que interactúa con varios sensores para conocer fenómenos físicos. La misma implementa los siguientes métodos:

```java
//retorna la temperatura en grados Fahrenheit.
public double getTemperatura()

//retorna la presión atmosférica en hPa
public double getPresion()

//retorna la radiación solar
public double getRadiacionSolar()

//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
public List<Double> getTemperaturas()

//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
public String displayData(){
return "Temperatura F: " + this.getTemperatura() +
   	  "Presión atmosf: " + this.getPresion() +
   	  "Radiación solar: " + this.getRadiacionSolar();
}

```

Esta clase se encuentra implementada por terceros y no se puede modificar. Pero sabemos que implementa la interfaz WeatherData que define los mismos mensajes.

Si bien el código de la clase HomeWeatherStation no se puede modificar, se requiere poder integrar diferentes configuraciones que combinen algunas de las siguientes funcionalidades:

La temperatura en grados Celsius (ºC = (ºF-32) ÷ 1.8).
El promedio de las temperaturas históricas.
Las temperaturas mínima y máxima histórica.

- Esto implica que la aplicación debe ser capaz de adaptarse a diferentes necesidades de visualización. Por ejemplo:

  - Ej 1: “Temperatura F: 86; Presión atmosf.: 1008; Radiación solar: 200;”
  - Ej 2: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200;”
  - Ej 3: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30;”
  - Ej 4: “Temperatura F: 86; Presión atmosf: 1008; Radiación solar: 200; Promedio: 86;”
  - Ej 5: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27 Máximo: 32;”
  - Ej 6: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Mínimo: 27 Máximo: 32;”
  - Ej 7: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Mínimo: 27 Máximo: 32; Promedio: 30;”

En cada uno de los ejemplos, la aplicación puede mostrar diferentes configuraciones de los datos, según lo que el usuario haya seleccionado previamente. Por ejemplo, la inclusión del promedio de temperatura (ya sea en grados Celsius o Fahrenheit) dependerá de la configuración de temperatura previamente establecida por el usuario.

Usted debe proveer la implementación del mensaje public String displayData() que devuelva los datos según lo configurado (dado que la app aun no cuenta con interface de usuario).

Tareas:

- 1- Modele una solución para el problema planteado. Si utiliza algún patrón, indique cuál
- 2- Implemente en Java
- 3- Implemente un test para validar la configuración del ejemplo 5, asumiendo que en el momento de la ejecución del mismo, los sensores arrojan los valores del ejemplo.
