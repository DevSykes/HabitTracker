package main;

import conector.ConectorBBDD;
import java.util.Scanner;

import controller.HabitoController;
import controller.UsuarioController;
import model.Habito;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicación...");
        ConectorBBDD.conectar();

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Te damos la bienvenida a HabitTracker");

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Gestionar usuarios");
            System.out.println("2. Mis hábitos");
            System.out.println("3. Registrar progreso diario");
            System.out.println("4. Eliminar hábito");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            String opcionStr = sc.nextLine();

            switch (opcionStr) {
                case "1":
                    System.out.println("Listado de usuarios en el sistema:");
                    UsuarioController userController = new UsuarioController();
                    for (Usuario u : userController.obtenerTodos()) {
                        System.out.println(u);
                    }
                    break;
                case "2":
                    System.out.println("Listado de hábitos:");
                    HabitoController habitoController = new HabitoController();
                    for (Habito h : habitoController.obtenerTodos()) {
                        System.out.println(h);
                    }
                    break;
                case "3":
                    System.out.println("\n--- REGISTRAR NUEVO HÁBITO ---");
                    System.out.print("Nombre del hábito: ");
                    String nombre = sc.nextLine();

                    System.out.print("Objetivo: ");
                    String obj = sc.nextLine();

                    System.out.print("ID de usuario (0, 1, 2...): ");
                    int idUser = Integer.parseInt(sc.nextLine());

                    Habito nuevo = new Habito();
                    nuevo.setNombre(nombre);
                    nuevo.setDescripcion(obj);
                    nuevo.setIdUsuario(idUser);

                    HabitoController hc = new HabitoController();
                    hc.crearHabito(nuevo);
                    break;
                case "4":
                    System.out.println("\n--- ELIMINAR HÁBITO ---");
                    System.out.print("Introduce el ID del hábito que quieres borrar: ");
                    int idBorrar = Integer.parseInt(sc.nextLine());

                    HabitoController hcBorrar = new HabitoController();
                    hcBorrar.eliminarHabito(idBorrar);
                    break;
                case "5":
                    System.out.println("Hasta la próxima");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
        sc.close();
    }
}