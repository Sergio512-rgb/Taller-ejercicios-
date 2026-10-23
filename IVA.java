package com.mycompany.ejercicio1;

import java.util.Scanner;

public class IVA {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double precio,Iva;
    
    System.out.println("digite el precio del articulo");
    precio =teclado.nextDouble();
    
    Iva=precio-precio/1.19;
    System.out.println("el valor pagado por el IVA es:" + Iva);
    
        
    }
}

