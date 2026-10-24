package com.example.taller11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double num1,num2,suma,resta,multiplicacion,division,modulo;
    
    System.out.println("digite el primer numero");
    num1 =teclado.nextDouble();
    
    System.out.println("digite el segundo numero");
    num2 =teclado.nextDouble();
    
    //AHORA VAMOS A REALIZAR LA SUMA DE LOS NUMEROS
    suma=num1+num2;
    System.out.println("la suma de los números es:" + suma);
    
    resta=num1-num2;
    System.out.println("la resta de los números es:" + resta);
    
    multiplicacion=num1*num2;
    System.out.println("la multiplicacion de los números es:" + multiplicacion);
    
    division=num1/num2;
    System.out.println("la divison de los números es:" + division);
    
    modulo=num1%num2;
    System.out.println("el módulo de los números es:"+ modulo);
        
    }
}
