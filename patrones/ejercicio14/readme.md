Ejercicio 14: Acceso a la base de datos
Queremos acceder a una base de datos que contiene información sobre cómics. Este acceso está dado por el comportamiento de la clase DatabaseRealAccess con el siguiente protocolo y modelado como muestra la siguiente figura.

![alt text](image.png)

```java
public interface DatabaseAccess {

// Realiza la inserción de nueva información en la base de datos y retorna el id que recibe la nueva inserción
//   @param rowData
//   @return

   public int insertNewRow(List<String> rowData);

 /**
    * Retorna una colección de acuerdo al texto que posee "queryString"
    *
    * @param queryString
    * @return
    */
   public Collection<String> getSearchResults(String queryString);

}
```

En este caso, ustedes recibirán una implementación prototípica de la clase DatabaseRealAccess (ver material extra) que simula el uso de una base datos de la siguiente forma (mire el código y los tests para entender cómo está implementada).

```java
// Instancia una base de datos que posee dos filas
   database = new DatabaseRealAccess();

   // Retorna el siguiente arreglo: ['Spiderman' 'Marvel'].
   database.getSearchResults("select * from comics where id=1");

   // Retorna 3, que es el id que se le asigna
   database.insertNewRow(Arrays.asList("Patoruzú", "La flor"));

   // Retorna el siguiente arreglo: ['Patoruzú', 'La flor'], ya que lo insertó antes
   database.getSearchResults("select * from comics where id=3");
```

Tareas:

- En esta oportunidad, usted debe proveer una solución utilizando un patrón que le permita brindar protección al acceso a la base de datos de forma que lo puedan realizar solamente usuarios que se hayan autenticado previamente. Su tarea es diseñar y programar en Java lo que sea necesario para ofrecer la funcionalidad antes descrita. Se espera que entregue los siguientes productos.

- Diagrama de clases UML.
- Implementación en Java de la funcionalidad requerida.
- Implementación de los tests (JUnit) que considere necesarios.

<img src="ejercicio14.drawio.png">
