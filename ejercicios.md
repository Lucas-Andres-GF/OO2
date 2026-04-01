Ejercicio 1: Red social
Se quiere programar en objetos una versión simplificada de una red social parecida a Twitter. Este servicio debe permitir a los usuarios registrados postear y leer mensajes de hasta 280 caracteres. Ud. debe modelar e implementar parte del sistema donde nos interesa que quede claro lo siguiente:
Cada usuario conoce todos los Tweets que hizo.
Un tweet puede ser re-tweet de otro, y este tweet debe conocer a su tweet de origen.
Twitter debe conocer a todos los usuarios del sistema.
Los tweets de un usuario se deben eliminar cuando el usuario es eliminado. No existen tweets no referenciados por un usuario.
Los usuarios se identifican por su screenName.
No se pueden agregar dos usuarios con el mismo screenName.
Los tweets deben tener un texto de 1 carácter como mínimo y 280 caracteres como máximo.
Un re-tweet no tiene texto adicional.



Tareas:

Su tarea es diseñar y programar en Java lo que sea necesario para ofrecer la funcionalidad antes descrita. Se espera que entregue los siguientes productos.

Diagrama de clases UML.
Implementación en Java de la funcionalidad requerida.
Implementar los tests (JUnit) que considere necesarios.

Nota: para crear el proyecto Java, lea el material llamado “Trabajando en OO2 con proyectos Maven”.


Ejercicio 2: Piedra Papel o Tijera
Se quiere programar en objetos una versión del juego Piedra Papel o Tijera. En este juego dos jugadores eligen entre tres opciones: piedra, papel o tijera. La piedra aplasta la tijera, la tijera corta el papel, y el papel envuelve la piedra. Los jugadores eligen una opción y se determina un ganador según las reglas: 



| Jugador 1 | Jugador 2 | Resultado |
|-----------|-----------|-----------|
| Piedra    | Papel     | Papel     |
| Piedra    | Tijera    | Piedra    |
| Piedra    | Piedra    | Empate    |
| Papel     | Piedra    | Papel     |
| Papel     | Papel     | Empate    |
| Papel     | Tijera    | Tijera    |
| Tijera    | Piedra    | Piedra    |
| Tijera    | Papel     | Tijera    |
| Tijera    | Tijera    | Empate    |



Tareas:
Diseñe e implemente una solución a este problema, de forma tal que dadas dos opciones, determine cuál fue la ganadora, o si hubo empate
Se desea extender al juego a una versión más equitativa que integre a lagarto y Spock, con las siguientes reglas:
Piedra aplasta tijera y aplasta lagarto.
Papel cubre piedra y desaprueba Spock.
Tijera corta papel y decapita lagarto.
Lagarto come papel y envenena Spock.
Spock rompe tijera y vaporiza piedra.
¿Qué cambios se necesitan agregar?
Agregue los cambios a la solución anterior.
