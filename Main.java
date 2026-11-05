package com.example.signonumero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int num;
       
       System.out.println("ingrese el valor del número");
       num =teclado.nextInt();
       
       if (num > 0 ) {
           System.out.println("el número es positivo ");
           
           if (num % 2 == 0){
           System.out.println("el número es par");
       } else {
           System.out.println("el número es impar");
       }
       
       
       } else {
           if (num < 0){
               System.out.println("el número es negativo");
           } else {
               System.out.println("el número es neutro");
           }
           
           if (num % 2 == 0) {
               System.out.println("el número es par");
           } else {
               System.out.println("el número es impar");
           }
           
           
       }
       
       
       
       
       
       
        
    }
}
