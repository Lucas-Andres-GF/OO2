Ejercicio 20c - Instanciando Secuencia de Filtros

Se desea crear una nueva versión del proyecto ImageFilter con secuencias para implementar reglas de combinación de filtros. Se ha detectado que la incorporación del filtro Monochrome implica combinaciones que no tienen sentido o que no genera resultados aceptables. Para entender estos casos pruebe las siguientes secuencias:
rainbow>monochrome vs monochrome>rainbow.
monochrome>artifacter vs artifacter>monochrome
rgb-shifter>monochrome vs monochrome>rgb-shifter

Se desea implementar dos tipos de filtros, aquellos que trabajan sobre el rango multicromáticos (Multichrome) y los monocromáticos (Monochrome). Considerando las siguientes reglas:
Secuencias multicromáticas no incluyen el filtro Monochrome
Secuencias monocromáticas no incluyen el filtro Rainbow
Secuencias monocromáticas aplican el filtro Monochrome como último paso de la secuencia

Tareas:

- Se debe diseñar una solución que oculte las reglas antes descriptas de tal manera que el código que use la librería simplemente delegue la creación de secuencias (consistentes) a los objetos resultantes de su diseño. Considere que en el futuro nuevos filtros o nuevas reglas pueden ser necesarias.
- Implemente su diseño de tal manera que pueda ser utilizado con la herramienta ejecutable del proyecto (PNGFilterLauncher)
- ¿Identifica algún patrón de diseño que sea esencial en su diseño?
  - ¿Cuál es el objetivo del patrón?
  - ¿Cuál es la estructura y cuáles son los participantes?
  - Analice la implementación y describa si existen detalles de implementación sean code smells o que no corresponden con el patrón
