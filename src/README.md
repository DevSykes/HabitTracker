# Módulo: Programación y MPO

Esta carpeta contiene el código fuente de la aplicación.
El proyecto se ha estructurado siguiendo el patrón de diseño **MVC** 
para garantizar la separación de responsabilidades y la escalabilidad del código.

## Arquitectura del Sistema y Diseño Orientado a Objetos

### 1. Modelo
Ubicado en el paquete `model`. Contiene las clases que representan las entidades de la base de datos:
* **`Usuario.java`**: Representa a los usuarios del sistema (ID, nombre, email, password).
* **`Habito.java`**: Define los hábitos creados por cada usuario.
* **`Registro.java`**: Gestiona las entradas de cumplimiento diario asociadas a un hábito.

### 2. Controlador
Ubicado en el paquete `controller`. Aquí se gestiona la comunicación con MySQL:
* **`UsuarioController.java`**: Gestiona el registro y la validación del Login.
* **`HabitoController.java`**: Implementa el **CRUD completo** (Crear, Listar, Filtrar y Eliminar hábitos).
* **`ConectorBBDD.java`**: (En el paquete `conector`) Centraliza la configuración de **JDBC**
* y gestiona la apertura de la conexión con el servidor MariaDB.

### 3. Vista (Interfaz de Usuario)
* **`Main.java`**: Punto de entrada de la aplicación. Gestiona el menú interactivo por consola y la captura de datos mediante `Scanner`.

---

## Pilares y Conceptos Aplicados (MPO + JDBC)

Para cumplir con los objetivos del proyecto, el código implementa:

* **Encapsulamiento**: Todas las clases del modelo utilizan atributos `private` con sus respectivos métodos `get` y `set`, protegiendo el estado interno de los objetos.
* **Persistencia Real con JDBC**: Comunicación fluida entre los objetos Java y las tablas MySQL.
* **Seguridad (PreparedStatement)**: Uso de parámetros en las consultas SQL para evitar ataques de inyección, garantizando la integridad de la aplicación.
* **Gestión de Errores (Excepciones)**: Implementación de bloques `try-catch` para capturar `SQLException`. Se ha utilizado **Try-with-resources** para asegurar que los objetos de conexión se cierren y liberen memoria automáticamente.
* **Uso de Colecciones**: Aplicación de `ArrayList` para gestionar conjuntos de objetos dinámicos.

---

## ⚙️ Requisitos de Ejecución
* **Java 17** o superior.
* **Driver:** MySQL Connector/J (incluido en las dependencias).
