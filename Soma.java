/******************************************************************************
 Desenvolva um programa que calcule a soma de dois numeros 
*******************************************************************************/

import java.util.Scanner ; 
public class Soma 
{
   public static void main (String [] args) {
    //declarar variaveis 
    double a , b ,  soma ; 
    Scanner ler =  new Scanner (System.in);
    
    System.out.println("digite o primeiro numero: ");
    a = ler.nextDouble ();
    
    System.out.println("digite o segundo numero: ");
    b = ler.nextDouble ();
    
    //processamento
    soma = a + b;
    
    //saida 
    System.out.println("o resultado sera: " + soma );
}
}