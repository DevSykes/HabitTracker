package controller;

import conector.ConectorBBDD;
import model.Habito;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HabitoController {

    public List<Habito> obtenerTodos() {
        List<Habito> lista = new ArrayList<>();
        String sql = "SELECT * FROM habito";

        try (Connection conn = ConectorBBDD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Habito h = new Habito();
                h.setId(rs.getInt("id_habito"));
                h.setNombre(rs.getString("nombre_habito"));
                h.setDescripcion(rs.getString("objetivo"));
                h.setFrecuenciaSemanala(0);
                h.setIdUsuario(rs.getInt("id_usuario"));

                lista.add(h);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar habitos: " + e.getMessage());
        }
        return lista;
    }

    public List<Habito> obtenerPorUsuario(int idUsuario) {
        List<Habito> lista = new ArrayList<>();
        String sql = "SELECT * FROM habito WHERE id_usuario = ?";

        try (Connection conn = ConectorBBDD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habito h = new Habito();
                h.setId(rs.getInt("id_habito"));
                h.setNombre(rs.getString("nombre_habito"));
                h.setDescripcion(rs.getString("objetivo"));
                h.setFrecuenciaSemanala(0);
                h.setIdUsuario(rs.getInt("id_usuario"));
                lista.add(h);
            }
        } catch (SQLException e) {
            System.err.println("Error al filtrar hábitos: " + e.getMessage());
        }
        return lista;
    }

    public void crearHabito(Habito h) {
        String sql = "INSERT INTO habito (nombre_habito, objetivo, id_usuario) VALUES (?, ?, ?)";

        try (Connection conn = ConectorBBDD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, h.getNombre());
            ps.setString(2, h.getDescripcion());
            ps.setInt(3, h.getIdUsuario());

            ps.executeUpdate();
            System.out.println("Hábito '" + h.getNombre() + "' registrado correctamente.");

        } catch (SQLException e) {
            System.err.println("Error al crear hábito: " + e.getMessage());
        }
    }

    public void eliminarHabito(int id) {
        String sql = "DELETE FROM habito WHERE id_habito = ?";

        try (Connection conn = ConectorBBDD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Hábito con ID " + id + " eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún hábito con ese ID.");
            }

        } catch (SQLException e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }
}