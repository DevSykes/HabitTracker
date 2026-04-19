# Diseño de la Base de Datos

## 1. Diagramas del Proyecto
A continuación se muestran los diseños visuales de la base de datos:
### Diagrama Entidad-Relación (E/R)
![Diagrama ER](diagrama_ER.png)

### Modelo Relacional (Esquema lógico)
![Modelo Relacional](modelo_relacional.png)

---

## 2. Descripción de Tablas
Aquí detallamos las tablas y sus claves (PK = Clave Primaria, FK = Clave Foránea):

*   **USUARIO** (**id_usuario**, nombre, email, password)
*   **HÁBITO** (**id_habito**, nombre_habito, objetivo, *id_usuario*)
*   **REGISTRO** (**id_registro**, fecha, estado, *id_habito*)

> **Nota:** La relación entre Usuario y Hábito es de 1 a muchos (1:N), ya que un usuario puede tener varios hábitos.
