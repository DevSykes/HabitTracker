# Diseño de la Base de Datos

Este es el esquema que define cómo se guardan los datos de los usuarios y sus hábitos.

## 1. Diagrama Entidad-Relación (E/R)
A continuación se muestra el diseño visual de las tablas y sus conexiones:

![Mi Diagrama de Base de Datos](diagrama_ER.pdf)

---

## 2. Modelo Relacional
Aquí detallamos las tablas y sus claves (PK = Clave Primaria, FK = Clave Foránea):

*   **USUARIO** (**id_usuario**, nombre, email, password)
*   **HÁBITO** (**id_habito**, nombre_habito, objetivo, *id_usuario*)
*   **REGISTRO** (**id_registro**, fecha, estado, *id_habito*)

> **Nota:** La relación entre Usuario y Hábito es de 1 a muchos (1:N), ya que un usuario puede tener varios hábitos.
