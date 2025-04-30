/******************************************************************************

Exercicio 023
Crie um vetor de 7 números inteiros e escreva um programa que encontre o 
maior número presente no vetor e exiba-o.
*******************************************************************************/
import java.util.Scanner;
public class geral23
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[7];
        int maior = 0;
        
        for (int i = 0; i < numeros.length; i++) {
        System.out.print("Digite sete valores: ");
            numeros[i] = ler.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
             if (numeros[i] > maior){
                 maior = numeros[i];
             }
        }
             System.out.println("O maior número é: "+maior);
             
        }
        
}