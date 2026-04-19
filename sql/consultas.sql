-- CONSULTAS SQL DEL PROYECTO HABITTRACKER

-- 1. LISTADO DE TODOS LOS USUARIOS
-- Se utiliza para mostrar los usuarios disponibles en la opción 1 del menú.
SELECT * FROM usuario;

-- 2. LISTADO DE HÁBITOS POR USUARIO
-- Sustituir el '?' por el ID del usuario seleccionado (ej. 0 para el usuario Sara).
SELECT * FROM habito WHERE id_usuario = ?;

-- 3. CREACIÓN DE UN NUEVO HÁBITO
-- Inserta un nuevo registro de hábito asociado a un usuario.
INSERT INTO habito (nombre_habito, objetivo, id_usuario) VALUES (?, ?, ?);

-- 4. ELIMINACIÓN DE UN HÁBITO
-- Borrado de un hábito mediante su ID.
DELETE FROM habito WHERE id_habito = ?;

-- 5. CONSULTA DE PRUEBA
-- Muestra los nombres de usuario junto a sus hábitos
SELECT u.nombre, h.nombre_habito, h.objetivo 
FROM usuario u 
JOIN habito h ON u.id_usuario = h.id_usuario;
