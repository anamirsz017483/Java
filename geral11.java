/******************************************************************************
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
*******************************************************************************/
import java.util.Scanner; 
public class geral11{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    double n1; 
    
    System.out.println("mostre o valor de um numero: "); 
    n1 = ler.nextDouble(); 
    if (n1 > 0 ){
        System.out.println("o numero é positivo: ");
    }else if (n1 < 0 ){
        System.out.println("o numero vai ser negativo: ");
    }else{
        System.out.println("o numero é inexistente: "); 
    }
    }
    }
    
    
    
    

