package model;

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