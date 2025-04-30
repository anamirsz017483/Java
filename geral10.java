/******************************************************************************
Faça um Programa que peça dois números e imprima o maior deles.
*******************************************************************************/
import java.util.Scanner; 
public class geral10{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    int n1, n2;
    
    System.out.println("mostre o valor do primeiro numero: ");
    n1 = ler.nextInt();
    System.out.println("mostre o valor do segundo numero: ");
    n2 = ler.nextInt(); 
    if (n1 > n2 ){
        System.out.println("o primeiro numero é maior: "); 
    }else{
        System.out.println("o segundo numero é maior: "); 
    }
    }
    }
    

