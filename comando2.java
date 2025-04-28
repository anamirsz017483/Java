/******************************************************************************
Faça um programa que calcule e exiba
a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner; 
public class comando2{
    public static void main (String [] args) {
       int contador = 1;
       int soma = 0 ; 
       
        
        for (int  i = 1; i <=100; i++ ) { 
            if (contador % 2 == 0) {
                soma += contador; 
                System.out.println ("os numeros pares de 1 a 100 é: "+contador);
            }
            contador++;
        }
    
                System.out.println ("os numeros pares de 1 a 100 é: "+soma);
    }
}    
