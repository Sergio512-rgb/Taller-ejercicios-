package com.example.taller3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        
        
        double nota1,nota2,nota3,porcentaje1,porcentaje2;
        double acumulado,falta;
        
        System.out.println("ingrese la nota del primer corte");
        nota1 =teclado.nextDouble();
        
        System.out.println("ingrese la nota del segundo corte");
        nota2 =teclado.nextDouble();
        
        porcentaje1 =nota1*0.20;
        porcentaje2 =nota2*0.20;
        acumulado = porcentaje1+porcentaje2;
        
        falta=3-acumulado;
        nota3= falta/0.60;
        System.out.println("-----------------");
        System.out.println("la nota requerida que debes sacar es:" + nota3);
    }
}
