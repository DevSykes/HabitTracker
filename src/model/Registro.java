package model;
import java.time.LocalDate;

public class Registro {
}

public class Registro {
    // atributos privados
    private int id;
    private int idHabito; //  tabla habitos
    private LocalDate fecha; // manejar fechas
    private boolean completado;

    public Registro() {}

    // nuevos registros
    public Registro(int idHabito, LocalDate fecha, boolean completado) {
        this.idHabito = idHabito;
        this.fecha = fecha;
        this.completado = completado;
    }

    //getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdHabito() { return idHabito; }
    public void setIdHabito(int idHabito) { this.idHabito = idHabito; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public boolean isCompletado() { return completado; }
    public void setCompletado(boolean completado) { this.completado = completado; }


    @Override
    public String toString() {
        return "Registro{" +
                "idHabito=" + idHabito +
                ", fecha=" + fecha +
                ", completado=" + completado +
                '}';
    }
}