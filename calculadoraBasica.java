package com.mycompany.ejerciciosjava;
import java.util.Scanner;

public class calculadoraBasica {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
       double num1,num2, suma, resta, multiplicacion, division;
       int opcion;
       
       System.out.println("1. Suma");
       System.out.println("2. Resta");
       System.out.println("3. Multiplicacion");
       System.out.println("4. División");
       System.out.println("Eliga una de las opciones");
       opcion =teclado.nextInt();
       
       System.out.println("Ingrese el valor del número 1");
       num1 =teclado.nextDouble();
       
       System.out.println("Ingrese el valor del número 2");
       num2 =teclado.nextDouble();
       
       
       switch (opcion) {
       case 1 -> {
           suma = num1 + num2;
           System.out.println("El resultado de la suma es:" + suma);
            }
           
       case 2 -> {
           resta = num1 + num2;
           System.out.println("El resultado de la resta es:" + resta);
            }
       
       case 3 -> {
           multiplicacion = num1 * num2;
           System.out.println("El resultado de la multiplicación es:" + multiplicacion);
            }
           
       case 4 -> {
           if (num2 == 0) {
               System.out.println("El número 2 no puede ser 0, utilize otro número"); 
               num2 =teclado.nextDouble();
           } 
               division = num1 / num2;
               System.out.println("El resultado de la división es:" + division);     
           }
        
     default -> System.out.println("Error. Por favor eliga un número del 1 al 4");
       }
     
     
     teclado.close();
       
    }
}