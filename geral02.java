/******************************************************************************
Faça um Programa que peça dois números e imprima a soma.
*******************************************************************************/
import java.util.Scanner; 
public class geral02{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    int n1;
    int n2; 
    int soma;
    
    System.out.println("entre com o primeiro numero desejado: ");
    n1= ler.nextInt();
    
    System.out.println("entre com o segundo numero desejado: ");
    n2 = ler.nextInt(); 
    
    soma = n1 + n2;
    System.out.println("a soma desses dois numero é: "+soma);
}
}
