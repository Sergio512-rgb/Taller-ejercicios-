package com.example.taller10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double precio,valorpagado;
    
    System.out.println("digite el precio del articulo");
    precio =teclado.nextDouble();
    
    valorpagado=precio*0.19;
    System.out.println("el valor pagado por el IVA es:" + valorpagado);
    
        
    }
}
