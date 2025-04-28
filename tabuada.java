/******************************************************************************
Crie um programa que solicite ao usuário
um número e exiba a tabuada desse número
utilizando um laço de repetição. Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class tabuada{
        public static void main (String [] args) { 
            Scanner ler = new Scanner (System.in);
        int contador = 1 ;
        int resultado;  
        int numero; 
        
        
        System.out.println("insira um numero para a tabuada: ");
        numero = ler.nextInt ();
        
        while( contador <= 10){
            resultado = numero * contador;
            System.out.println(+numero+ "x" +contador+ "="+resultado); 
            contador++; 
        }
        

}
}

