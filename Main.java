package com.example.taller2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
 double salariototal,horatotal,valorhora;       
        System.out.println("cuanto es su salario total?");
        salariototal = teclado.nextDouble();
        
        System.out.println("cuantas horas trabajaste?");
        horatotal = teclado.nextDouble();
        
        valorhora = salariototal/horatotal;
        System.out.println("el valor de una hora trabajada es:" + valorhora);
        
        
    }
}
