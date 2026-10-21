
package com.mycompany.ejercicio1;
import java.util.Scanner;

public class EDAD {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int edad;
        
        System.out.println("digita tu edad");
        edad =teclado.nextInt();
        
        if (edad>= 18){
            System.out.println("la persona es mayor de edad:" + edad);
        }
        else {  System.out.println("no es mayor de edad:" + edad);
        }
        
        
        }
        
        
    }

