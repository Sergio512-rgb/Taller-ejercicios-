package com.example.taller4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    
    int base,area, altura;
    
    System.out.println("digite el valor de la base");
    base =teclado.nextInt();
    
    System.out.println("digite el valor de la altura");
    altura =teclado.nextInt();
    
    area =base*altura/2;
    System.out.println("el área del triángulo es:" +area); 
    
     
    }
}
