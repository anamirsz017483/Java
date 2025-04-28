/******************************************************************************
Crie um programa que solicite ao usuário 
um número e exiba a tabuada desse número
utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner;
public class tabuada2{
        public static void main (String [] args) { 
            Scanner ler = new Scanner (System.in);
        int contador = 1 ;
        int resultado;  
        int numero; 
        
        
        System.out.println("insira um numero para a tabuada: ");
        numero = ler.nextInt ();
        
       for (int i = 0; i <= 10;i++){
           resultado = numero * i;
           
           System.out.println(numero+"x"+i+"="+resultado);
       }
        }
        

}


