package com.example.taller15;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int articulo,cantidad,valortotal;
    
    System.out.println("ingrese el valor por unidad del articulo");
    articulo =teclado.nextInt();
    
    System.out.println("ingrese la cantidad de articulos");
    cantidad =teclado.nextInt();
    
    valortotal =articulo*cantidad;
    System.out.println("el valor total a pagar es:" + valortotal);
        
    }
}
