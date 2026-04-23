# Entornos de Desarrollo - Gestión del Proyecto Intermodular: HabitTracker

Este apartado detalla las herramientas y metodologías utilizadas para el control de versiones y la organización del ciclo de vida del proyecto.

## 1. Control de Versiones (Git & GitHub)
Para este proyecto se ha utilizado **Git** como sistema de control de versiones local y **GitHub** como repositorio remoto.

* **Estrategia de Commits:** He seguido una nomenclatura clara en los mensajes de commit para facilitar el seguimiento de los cambios (ej. `feat:`, `docs:`).
* **Gestión de ramas:** El desarrollo principal se ha centralizado en la rama `main`, asegurando que cada subida represente un avance estable en la documentación o el código.

## 2. Estructura del Proyecto
El proyecto está organizado de forma modular para cumplir con los requisitos de todas las asignaturas del intermodular:

* `/src`: Código fuente en Java (Programación y MPO).
* `/sql`: Scripts de creación y consultas de la base de datos (BBDD).
* `/docs`: Documentación técnica y específica de cada módulo.
    * `/docs/sistemas-informaticos`: Requisitos y hardware.
    * `/docs/lenguaje-de-marcas`: Archivos XML y validación XSD.
    * `/docs/itp`: Perfil profesional y empleabilidad.
    * `/docs/entornos-desarrollo`: Documentación sobre estrategia de trabajo y organización

## 3. Automatización y Herramientas
* **IDE:** Se ha utilizado IntelliJ IDEA para el desarrollo de la lógica en Java.
* * **Diseño de Diagramas:** Se ha utilizado draw.io para la creación de los diagramas Entidad/Relación y esquemas de arquitectura, permitiendo una representación visual clara de la estructura de datos.
* **Gestión de Base de Datos:** Uso de MySQL para el diseño del modelo E/R y la ejecución de scripts.
* **Documentación:** Uso de lenguaje **Markdown** para asegurar que toda la documentación sea legible directamente desde el repositorio de GitHub.
