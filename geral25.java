/******************************************************************************

Exercicio 025
Crie um vetor de 6 números inteiros e escreva um programa que inverta a ordem
dos elementos do vetor. Exiba o vetor original e o vetor invertido.
*******************************************************************************/
import java.util.Scanner;
public class geral25
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[6];
        int maior = 0;
        
        for (int i = 0; i < numeros.length; i++) {
        System.out.print("Digite seis valores: ");
            numeros[i] = ler.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
             System.out.println(numeros[i]);
        }           
        }
        
}