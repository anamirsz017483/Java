/**************************************************************************************
 Escreva um programa que exiba os números 
pares de 1 a 50 e os números ímpares de 51 a 100 utilizando
um laço de repetição. Utilize while
*************************************************************************/
import java.util.Scanner;
public class numerosde1a50
{
    public static void main(String [] args ){
        int contador = 1;
       
        
        while (contador <= 100  ){
            if(contador%2 == 0 && contador <= 50)
                System.out.println("numeros pares de 1 a 50 são: " + contador);
            if(contador%2 == 1 && contador >= 51)
                System.out.println("numeros ímpares de 51 a 100 são: " + contador);
            contador++;
        }

            
            
        }
    }
