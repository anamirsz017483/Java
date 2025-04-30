/******************************************************************************
Faça um Programa que converta metros para centímetros.
*******************************************************************************/
import java.util.Scanner; 
public class geral04{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
   double metros, converso; 
   
   System.out.println("mostre a quantidade em metros: ");
   metros =  ler.nextDouble();
    
   converso  =  metros / 100; 
   
   System.out.println ("a conversão por centimetros é de: "+converso);
    }
}
