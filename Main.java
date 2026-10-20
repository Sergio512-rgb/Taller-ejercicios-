package com.example.taller5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int lado1,lado2,lado3,perimetro;
        
        System.out.println("digite el primer lado");
        lado1 =teclado.nextInt();
        
        System.out.println("digite el segundo lado");
        lado2 =teclado.nextInt();
        
        System.out.println("digite el tercer lado");
        lado3 =teclado.nextInt();
        
        perimetro =lado1+lado2+lado3;
        System.out.println("el perimetro es:" + perimetro);
        
        
    }
}
