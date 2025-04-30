/******************************************************************************
Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
*******************************************************************************/
import java.util.Scanner; 
public class geral06{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    double temperatura, celcius; 
    
    System.out.println("mostre a temperatura em Farenheit: ");  
    temperatura = ler.nextDouble();
    celcius = (5 * (temperatura-32) / 9);
    System.out.println("a temperatura em celcius é:"+celcius);
    }
}
