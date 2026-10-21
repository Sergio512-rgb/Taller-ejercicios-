
package com.mycompany.ejercicio1;
import java.util.Scanner;

public class DIASsemana {
    public static void main(String[] args) { 
        
    
        Scanner teclado = new Scanner(System.in);
        
 int num;
 
        System.out.println("digita un numero del 1 al 7");
        num =teclado.nextInt();
        
        if (num== 1){
            System.out.println("lunes");
        }
        
        if (num== 2){
            System.out.println("martes");           
        }
        
        if (num== 3){
            System.out.println("miercoles");
        }
        
        if (num== 4){
            System.out.println("jueves");
        }
        
        
        if (num== 5){
            System.out.println("viernes");
        }
       
        if (num== 6){
            System.out.println("sabado");
        }
    
        if (num== 7){
            System.out.println("domingo");
        }
    
        
        
        
    }
}
