/******************************************************************************
Faça um Programa que leia três números e mostre o maior deles.
*******************************************************************************/
import java.util.Scanner; 
public class geral13{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
        int n1, n2, n3;
     
     System.out.println("mostre o valor do primeiro numero: ");
     n1 = ler.nextInt();
     System.out.println("mostre o valor do segundo numero: ");
     n2 = ler.nextInt(); 
     System.out.println("mostre o valor do terceiro numero: ");
     n3 = ler.nextInt();
     
     if (n1 > n2 && n1 > n3 ){
         System.out.println("o primeiro numero é maior: "); 
     }else if (n2 > n1 && n2 > n3) { 
         System.out.println("o segundo numero é maior: "); 
     }else{
         System.out.println("o terceiro numero é maior: ");
     }
     
     }
     }
     
    

