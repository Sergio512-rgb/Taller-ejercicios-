package com.example.taller7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double celsius,Fahrenheit;
    
    System.out.println("ingrese el valor de la temperatura en grado Fahrenheit");
    Fahrenheit =teclado.nextDouble();
    
    celsius=(Fahrenheit-32)/1.8;
    System.out.println("el valor ingresado en grados celsius es:" + celsius);
    
        
    }
}
