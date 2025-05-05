/******************************************************************************
Crie um programa em Java que leia um número inteiro e diga se ele é par ou ímpar.
*******************************************************************************/
import java.util.Scanner; 
public class prova01 
{
    public static void main (String [] args ){
        Scanner ler = new Scanner (System.in);
        int n;
        
        System.out.println("entre com um numero: ");
        n = ler.nextInt ();
        if (n % 2 == 0 ) {
            System.out.println ("o numero mostrado é par: ");
        }else{
            System.out.println ("o numero mostrado é impar: ");
        }
        }
    }
