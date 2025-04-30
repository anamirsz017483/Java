/******************************************************************************
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 
*******************************************************************************/
import java.util.Scanner; 
public class geral01{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    int numero; 
    
    System.out.println("entre com um numero desejado: ");
    numero = ler.nextInt();
    
    System.out.println("o numero desejado foi: "+numero);
}
}
