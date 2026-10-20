package com.example.taller12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int numero1, modulo;
    
    System.out.println("ingrese un número entero ");
    numero1=teclado.nextInt();
    
    modulo=numero1 % 10;
    System.out.println("el resultado es:"+ modulo);
    
    
        
    }
}
