/******************************************************************************
Crie um programa que solicite ao usuário
um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner; 
public class comando{
    public static void main (String [] args) {
       int contador = 1;
       int soma = 0 ; 
       
        
        while (contador <= 100) { 
            if (contador % 2 == 0) {
                soma += contador;
        System.out.println("os numeros pares de 1 a 100 é:" +soma);
            }
        contador++;
    }
    System.out.println("os numeros pares de 1 a 100 é:" +soma);
}
}

    
    
