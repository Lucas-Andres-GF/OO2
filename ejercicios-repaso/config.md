# Guía de Configuración: Nuevo Proyecto Java + Maven

Esta guía detalla los pasos para iniciar un proyecto desde cero en **VS Code**, asegurando la compatibilidad con **Java 21** y las herramientas de **Objetos 2**.

---

## 1. Creación del Proyecto

1. Presioná `Ctrl + Shift + P` para abrir la paleta de comandos.
2. Escribí y seleccioná: **Java: Create Java Project...**
3. Elegí **Maven** como herramienta de construcción.
4. Seleccioná el arquetipo: `maven-archetype-quickstart` (versión 1.4 o la más reciente).
5. **Group Id:** `ar.edu.unlp.info.oo2` (o el paquete que pida la cátedra).
6. **Artifact Id:** Nombre del ejercicio (ej. `ejercicio1-red-social`).
7. Seleccioná la carpeta de destino y esperá a que la terminal diga `BUILD SUCCESS`.

---

## 2. Ajuste Crítico del `pom.xml`

Maven genera por defecto proyectos para Java 1.7. **Debés cambiarlo manualmente** para que el linter y el compilador funcionen.

1. Abrí el archivo `pom.xml` en la raíz del proyecto.
2. Buscá la sección `<properties>` y actualizá a **21**:

```xml
<properties>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <maven.compiler.source>21</maven.compiler.source>
  <maven.compiler.target>21</maven.compiler.target>
</properties>
```

3. **Sincronizá VS Code:** Al guardar, aparecerá un cartel abajo a la derecha. Hacé clic en **Now** o **Yes**. Si no aparece, hacé clic derecho en el proyecto y elegí **Java: Update Project Configuration**.

---

## 3. Limpieza y Compilación Inicial

Antes de escribir código, asegurate de que el entorno esté "masticando" bien el proyecto:

1. Abrí una terminal (Git Bash).
2. Ejecutá el combo de limpieza e instalación:
   ```bash
   mvn clean install
   ```
   > **Pro-Tip:** Si este comando falla, revisá la pestaña de **PROBLEMAS** en VS Code. No intentes programar si hay errores rojos ahí.

---

## 4. Estructura de Trabajo

Mantené siempre este orden para no marearte:

- **Lógica del Sistema:** `src/main/java/ar/edu/unlp/info/oo2/...`
- **Tests Unitarios:** `src/test/java/ar/edu/unlp/info/oo2/...`

---

## 5. Uso del Linter (SonarQube/SonarLint)

El linter te ayudará a no cometer errores de sintaxis (como usar comillas simples en Strings).

- **Línea Roja:** Error de compilación (el código no va a correr).
- **Línea Amarilla/Azul:** "Code Smell" o sugerencia de mejora de diseño de Objetos.

---

## 6. Comandos Útiles de Maven (Lifecycle)

| Comando       | Función                                                  |
| :------------ | :------------------------------------------------------- |
| `mvn clean`   | Borra compilaciones viejas (limpia la carpeta `target`). |
| `mvn compile` | Verifica que no tengas errores de sintaxis.              |
| `mvn test`    | Corre los tests de JUnit. **Es lo que más usarás.**      |
| `mvn install` | Hace todo lo anterior y prepara el proyecto.             |

---

> **Recordatorio para Objetos 2:** > Siempre que crees una clase nueva, recordá usar las **Acciones de Código Fuente** (clic derecho) para generar los Getters, Setters y Constructores automáticamente. ¡No los escribas a mano!
