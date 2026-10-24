package com.example.taller16;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    
    double area, R;
    
    System.out.println("ingrese el valor del radio");
    R =teclado.nextDouble();
    
    area =3.1416*(R *R);
    System.out.println("el valor del área es:" +area);
        
        
    }
}
