package com.example.taller6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double gradocelsius,Fahrenheit;
    
    System.out.println("ingrese el valor de la temperatura en grado celsius");
    gradocelsius =teclado.nextDouble();
    
    Fahrenheit=(gradocelsius*1.8)+32;
    System.out.println("el valor ingresado en grados Fahrenheit es:" + Fahrenheit);
        
    }
}
