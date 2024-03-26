# Filtro de empleados

## Descripción

El siguiente proyecto tiene como objeto el uso de la arquitectura MVC para el desarrollo de una aplicación. La aplicación desarrollada a continuación, lista los empleados que se encuentran almacenados en la base datos y también filtra por cargo.

## Instrucciones de descarga
Para descargar y compilar el siguiente proyecto siga la siguiente instrucciones:

1. Clonar o descargar el repositorio, para clonar use el siguiente comando:
```
git clone https://github.com/juanjmorelos/flutter_cinemapedia.git
```
2. Dirijase a la carpeta MySQL Database y descargue el archivo `employee_database.sql`, que contiene las tablas de la base de datos utilizada.

3. Cree una base de datos, se recomienda utilizar el nombre `employee_database` e importe los datos que allí se encuentran. Cabe recalcar que se utilizo el gestor de base de datos relacionales MySQL

Si cambia el nombre de la base de datos prosiga con el paso 4, de lo contrario ya puede compilar el proyecto

4. Dirijase al archivo `controller/SQLController.java` y cambie el nombre de la variable `dbName` por el nombre que le proporcionó a la base de datos que incluirá las tablas, de la siguiente forma:
```java
public class SQLController {
    private final String dbUser = "root";
    private final String dbPassword = "";
    private final String dbName = ""; //aquí debe cambiar el nombre que esta por el nuevo
    private final String dbUrl = "jdbc:mysql://localhost/" + dbName;
    private Connection connection;

    /* Más código */
```