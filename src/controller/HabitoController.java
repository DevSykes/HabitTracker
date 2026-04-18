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
}