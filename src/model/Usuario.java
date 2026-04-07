package model;

public class Usuario {
}
// atributos privados
private int id;
private String nombre;
private String email;
private String password;

public Usuario() {}

public Usuario(String nombre, String email, String password) {
    this.nombre = nombre;
    this.email = email;
    this.password = password;
}