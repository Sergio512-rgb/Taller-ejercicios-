package com.example.taller9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado= new Scanner (System.in);
    
    int tarifa,preciopagado;
    double descuento,porcentaje;
    
    System.out.println("ingrese el precio de la tarifa");
    tarifa = teclado.nextInt();
    
    System.out.println("ingrese el precio pagado");
    preciopagado =teclado.nextInt();
    
    descuento =tarifa-preciopagado;
    System.out.println("el descuento de la compra es de:" + descuento);
    
    porcentaje=descuento/tarifa*(100);
    System.out.println("el porcentaje de descuento es:" +porcentaje);
      
        
    }
}
