# HabitTracker - Proyecto Intermodular

Este repositorio contiene el desarrollo de **HabitTracker**, una solución integral para la gestión de hábitos, integrando lógica en Java, persistencia en MySQL y configuración en XML.

## 1. Resumen y Problemática
HabitTracker es una herramienta de organización personal diseñada para monitorizar rutinas diarias.
* **¿Qué problema resuelve?**: Ayuda a superar la falta de constancia mediante un registro estructurado y seguro de actividades, eliminando la dispersión de datos y permitiendo una visualización clara del progreso.

## 2. Control de Versiones (Git & GitHub)
Para este proyecto se ha utilizado **Git** como sistema de control de versiones local y **GitHub** como repositorio remoto.

* **Estrategia de Commits:** He seguido una nomenclatura clara (ej. `feat:`, `docs:`, `refactor:`) para mantener un historial trazable.
* **Gestión de ramas:** El desarrollo se ha centralizado en la rama `main`, asegurando que cada subida represente un avance estable.

## 3. Tecnologías y Herramientas
* **IDE:** IntelliJ IDEA para el desarrollo de la lógica en Java.
* **Base de Datos:** MySQL para el diseño y ejecución de scripts.
* **Diseño:** draw.io para la creación de los diagramas Entidad/Relación.
* **Documentación:** Lenguaje Markdown para asegurar la legibilidad del repositorio.

## 4. Estructura del Proyecto
* `/src`: Código fuente en Java (MPO y Programación).
* `/sql`: Scripts de creación y consultas de la base de datos (BBDD).
* `/docs`: Documentación técnica específica:
    * `/docs/sistemas-informaticos`: Requisitos y hardware.
    * `/docs/lenguaje-de-marcas`: Archivos XML y validación XSD.
    * `/docs/itp`: Perfil profesional y portfolio.
    * `/docs/entornos-desarrollo`: Estrategia de trabajo y calidad.

## 5. Instrucciones de Instalación y Ejecución
1. **Base de Datos:** Ejecuta el script de la carpeta `/sql` en tu servidor MySQL local.
2. **Dependencias:** Asegúrate de incluir el conector JDBC de MySQL en las librerías del proyecto.
3. **Ejecución:** Lanza la aplicación desde la clase `Main.java` en la carpeta `/src`.

## 6. Refactorización y Calidad
* **Código Limpio:** Uso de nombres de variables descriptivos y legibles.
* **Arquitectura:** Aplicación del patrón **MVC** para separar la lógica de los datos.
* **Escalabilidad:** Estructura de carpetas modular para facilitar futuras ampliaciones.

## 7. Evidencias de Funcionamiento

![Ejecución](./docs/itp/img/xxx.png)
