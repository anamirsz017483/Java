/******************************************************************************
Escreva um programa que exiba os números 
pares de 1 a 50 e os números ímpares de 51 a 100 
utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner;
public class repeticao2{
    public static void main (String [] args) {
        int contador = 1;

   for (int i=1; i<=100; i++){
       if(i <= 50 && i % 2 == 0)
        System.out.println("Números pares de 1 a 50: "+i);
       if(i > 50 && i <= 100 && i % 2 == 1)
        System.out.println("Números impares de 51 a 100: "+i);
       
    }
}
}