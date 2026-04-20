# Documentación: Lenguaje de Marcas 

Para este módulo, he aplicado el uso de los conocimientos de la asignatura de
lenguajes de marcas tanto en la documentación como en la configuración del sistema.

## 1. Configuración con XML y XSD
He creado un sistema de configuración externo para que el programa no tenga los datos "escritos a mano" en el código:
* **Ubicación:** Se encuentra en la carpeta `/config` de la raíz.
* **Validación:** He creado un archivo **XSD** para asegurar que los datos del XML sean correctos.

## 2. Evidencia de validación
A continuación, se muestra una captura de pantalla que confirma que el archivo `config.xml` es válido y cumple con las reglas del `esquema.xsd`:

![Validación XML](img/validacion_xml.png) 
