# Sistemas Informáticos

En este apartado explico qué necesita un ordenador para que mi aplicación funcione bien y cómo hay que instalarlo todo.

## Entorno de Ejecución

La aplicación ha sido desarrollada y probada bajo el siguiente entorno:

* **Sistema Operativo:** Windows 11 (Funciona en Windows 10 también).
* **Tipo de sistema:** 64 bits (x64).
* **Servidor para la base de datos:** XAMPP (versión 3.3.0).
* **Motor de Base de Datos:** MariaDB (MySQL Service).
* **Versión de Java:** Java 17 o superior.

## Requisitos de Hardware

Para asegurar la fluidez del sistema y el servidor de base de datos, se recomienda:

* **Procesador:** 2.0 GHz o superior.
* **Memoria RAM:** 4 GB (Mínimo 2 GB libres para XAMPP + JVM).
* **Almacenamiento:** 200 MB libres son suficientes para guardar el programa y los datos de los hábitos.

## Guía de Instalación y Configuración

Para desplegar el sistema correctamente, se deben seguir estos pasos:

1. **Gestión de Servicios:**
   - Iniciar **XAMPP Control Panel**.
   - Arrancar el servicio **MySQL** (Puerto por defecto: 3306).
   
2. **Configuración de Red:**
   - El sistema conecta mediante `localhost` (127.0.0.1). 
   - En caso de conflicto de puertos, verificar que ninguna otra instancia de SQL Server o Docker esté ocupando el puerto.

3. **Importación del Esquema:**
   - Acceder a `phpMyAdmin` y ejecutar el script `gestor_habitos.sql` ubicado en la carpeta `/sql`.

4. **Variables de Entorno:**
   - Asegurarse de que `JAVA_HOME` apunta correctamente al JDK 17 en las variables de entorno del sistema.
  
5. **Mantenimiento y Logs:**
   - En caso de error en el arranque del servicio, consultar los logs de MySQL desde el botón "Logs" en XAMPP para identificar colisiones de procesos o errores de privilegios.
