package com.example.taller1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objeto para leer datos desde el teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables
        int hora, horastrabajadas;
        double salariototal, salarioneto, descuento;
        
        // Entrada de datos
        System.out.println("ingrese el valor de la hora");
        hora = teclado.nextInt();
        
        System.out.println("cantidad de horas trabajadas");
        horastrabajadas = teclado.nextInt();
        
        // Procesos y cálculos
        salariototal = hora * horastrabajadas;
        System.out.println("el salario total es: " + salariototal);
        
        descuento = salariototal * 0.05;
        System.out.println("el 5% del salario total es: " + descuento);
        
        salarioneto = salariototal - descuento;
        System.out.println("su salario neto es: " + salarioneto);
    }
}
