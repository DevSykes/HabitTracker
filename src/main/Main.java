package main;

import conector.ConectorBBDD;
import java.util.Scanner;

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
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            String opcionStr = sc.nextLine();

            switch (opcionStr) {
                case "1":
                    System.out.println("Entrando en gestión de usuarios...");
                    break;
                case "2":
                    System.out.println("Entrando en hábitos...");
                    break;
                case "3":
                    System.out.println("Registrando progreso...");
                    break;
                case "4":
                    System.out.println("Nos vemos");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        sc.close();
    }
}