package model;

public class Habito {
    // Atributos privados
    private int id;
    private String nombre;
    private String descripcion;
    private int frecuenciaSemanal;
    private int idUsuario;

    // Constructor
    public Habito() {}

    // nuevos hábitos
    public Habito(String nombre, String descripcion, int frecuenciaSemanala, int idUsuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.frecuenciaSemanal = frecuenciaSemanala;
        this.idUsuario = idUsuario;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getFrecuenciaSemanala() { return frecuenciaSemanal; }
    public void setFrecuenciaSemanala(int frecuenciaSemanala) { this.frecuenciaSemanal = frecuenciaSemanala; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    // datos en consola
    @Override
    public String toString() {
        return "Habito{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", frecuencia=" + frecuenciaSemanal +
                ", idUsuario=" + idUsuario +
                '}';
    }
}