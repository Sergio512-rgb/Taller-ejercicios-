package com.example.taller8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    double millas, metros;
    
    System.out.println("ingrese la cantidad de millas marinas");
    millas =teclado.nextDouble();
    
    metros= millas*1852;
    System.out.println("la distancia en metros es:" + metros);  
        
    }
}
