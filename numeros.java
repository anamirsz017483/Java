/******************************************************************************
 Escreva um programa que calcule a soma dos números de 1 a 15.

*******************************************************************************/
import java.util.Scanner ; 
public class numeros {
    public static void main (String [] args ) {
        Scanner ler =  new Scanner (System.in);
        int  n ; 
        
        int  soma = 0; 
        for (int i=1; i <=15 ; i++) {
            soma = soma + i;
        }
            
          System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}

