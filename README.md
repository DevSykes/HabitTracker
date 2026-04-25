# HabitTracker - Gestión de Hábitos hecho por Sara Zarzosa Brea

HabitTracker es una aplicación de escritorio diseñada para monitorizar y mantener rutinas diarias. 
Este proyecto integra los conocimientos técnicos de todos los módulos del **1º curso de DAM**, conectando la lógica de programación con la persistencia de datos y la configuración estructurada.

## Guía de navegación para profesores

| Módulo | Documentación y Recursos | Acceso Directo |
| :--- | :--- | :---: |
| **Bases de Datos** | Scripts `.sql`, Modelo E/R y repositorio de consultas. | [📂 Ir a /sql](./sql) |
| **Programación y MPO** | Estructura de código Java, organización de paquetes y lógica MVC. | [📂 Ir a /src](./src) |
| **Entornos de Desarrollo** | Historial de versiones, gestión de Git y estructura raíz. | [📂 Ver README](./docs/entornos-desarrollo) |
| **Sistemas Informáticos** | Especificaciones técnicas, requisitos y detalles del sistema. | [📂 Ver README](./docs/sistemas-informaticos) |
| **Lenguaje de Marcas** | Archivos XML y su validación. | [📂 Ir a /config](./config) y [README](./docs/lenguaje-de-marcas) |
| **ITP (Itinerario)** | Perfil profesional, análisis de sector y memoria final. | [📂 Ver perfil](./docs/itinerario-empleabilidad) |



## Instalación y Puesta en Marcha
Para ejecutar la aplicación correctamente, sigue estos pasos:
1. **Base de Datos:** Importa el script `database.sql` en tu servidor local (XAMPP/MySQL).
2. **Configuración:** Asegúrate de que los credenciales en `config/configuracion.xml` coinciden con tu entorno local.
3. **Ejecución:** Compila y ejecuta la clase `Main.java` (requiere JDK 17 o superior).

## Funcionalidades Principales
* **Registro de hábitos:** Alta, baja y modificación de actividades diarias.
* **Persistencia Real:** Los datos se almacenan de forma segura en una base de datos MariaDB.
* **Configuración Dinámica:** El sistema lee el idioma y los parámetros de conexión desde un archivo XML validado.
* **Validación de Datos:** Uso de esquemas XSD para prevenir errores de configuración.

## Requisitos del Sistema
* **SO:** Windows/Linux/macOS.
* **Software:** XAMPP (MySQL/MariaDB) y JRE/JDK 17+.
* **Hardware:** Mínimo 4GB RAM y 100MB de espacio en disco.

---
**Autora:** Sara Zarzosa Brea.
