# Gestor de Hábitos - Proyecto Intermodular

## Descripción
Esta aplicación permite realizar un seguimiento personalizado de hábitos diarios, permitiendo a los usuarios registrar, visualizar y gestionar sus progresos.
El proyecto integra el desarrollo de software en Java con una base de datos relacional MariaDB.

## Requisitos del Sistema
Para el correcto funcionamiento de la aplicación, se recomienda el siguiente entorno:

### Hardware
* **Procesador:** 2.0 GHz o superior.
* **Memoria RAM:** 4 GB (Mínimo 2 GB libres para XAMPP + JVM).
* **Almacenamiento:** 200 MB de espacio libre.

### Software y Entorno de Ejecución
* **Sistema Operativo:** Windows 10/11 (64 bits).
* **Java:** JDK 17 o superior.
* **Servidor de Base de Datos:** XAMPP (v3.3.0) con servicio MariaDB/MySQL activo.
* **Conector:** `mysql-connector-j-8.x` (JDBC).

## Instalación y Configuración
1. **Preparar Base de Datos:**
   - Iniciar **XAMPP Control Panel** y arrancar el servicio **MySQL** (Puerto 3306).
   - Acceder a `phpMyAdmin`.
   - Importar el script `gestor_habitos.sql` ubicado en la carpeta `/sql` del proyecto.
2. **Configuración de Seguridad y Conexión:**
   - La aplicación conecta mediante `localhost`.
   - **Usuario:** `root`
   - **Contraseña:** (Vacío / Sin contraseña)
   - **Privilegios:** El usuario `root` debe tener permisos totales (ALL PRIVILEGES) sobre la base de datos para realizar operaciones CRUD.
3. **Ejecución:**
   - Asegurarse de que `JAVA_HOME` apunta al JDK 17 en las variables de entorno.
   - Ejecutar la aplicación desde el IDE o mediante la línea de comandos.

## Tecnologías Utilizadas
* **Lenguaje:** Java 17.
* **Persistencia:** JDBC (Java Database Connectivity).
* **Base de Datos:** MariaDB (vía XAMPP).
* **Control de Versiones:** Git y GitHub.

## Evidencias

1. **Funcionamiento en consola**

![Evidencia de funcionamiento en consola](/docs/imagenes/funcionamiento.png)

2. **Servidor Activo:**

![Evidencia de funcionamiento en consola](/docs/imagenes/xampp.png)

3. **Persistencia:**

![Evidencia de funcionamiento en consola](/docs/imagenes/sql1.png)
