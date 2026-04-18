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
    }
}