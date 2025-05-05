 /******************************************************************************
Exercício 03 -  Faça um programa que leia um número inteiro e diga se ele é primo.
Um número é  primo se for maior que 1 é divisível apenas por 1 e por ele mesmo.  
*******************************************************************************/
import java.util.Scanner;
public class prova03
{
public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int numero;

System.out.println ("Digite um número inteiro: ");
numero= ler.nextInt ();

if (numero/numero==1 && numero/1==numero){
System.out.println ("O número digitado é primo");
} else {
System.out.println ("O número digitado não é primo");
}
    }
}