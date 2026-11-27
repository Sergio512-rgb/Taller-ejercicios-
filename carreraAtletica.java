package com.example.arrays;

public class carreraAtletica {
    public static void main(String[] args) {
    
    
int[] resultados = { 18, 29, 22, 25, 16, 26, 21, 23, 20, 27, 24, 19, 28, 17, 30, 22, 25, 21, 18, 26, 23, 20, 29, 17, 27, 24, 19, 28, 22, 25, 21, 17, 18, 26, 23, 20, 29, 24, 19, 27, 22, 25, 18, 28, 21, 17, 23, 20, 26, 24, 19, 27, 22, 25, 17, 28, 21, 18, 29, 23, 20, 26, 24, 19, 22, 25, 17, 27, 21, 18, 29, 23, 20, 26, 24, 19, 28, 22, 25, 17, 21, 18, 27, 23, 20, 29, 24, 19, 26, 22, 25, 17, 28, 21, 18, 23, 20, 27, 24, 19, 29, 22, 25, 17, 28, 21 };

int menorTiempo = resultados[0], mayorTiempo = resultados[0];

for (int i = 0; i < resultados.length; i++) {
    
    
    if (resultados[i] < menorTiempo) {
        menorTiempo = resultados[i];
    }
    
    if (resultados[i] > mayorTiempo) {
        mayorTiempo = resultados[i];
    }
    
    
}

System.out.println("La cantidad de competidores que participaron en la carrera es:" + resultados.length);
System.out.println("El tiempo que le tomo al competidor terminar la carrera en el primer puesto fue:" + menorTiempo);
System.out.println("El tiempo que le tomo al competidor terminar la carrera en el último puesto fue: " + mayorTiempo);

   }
  
}






