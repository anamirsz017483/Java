/******************************************************************************

Exercicio 021
Crie um vetor de 10 inteiros e inicialize-o com valores sequenciais
(1, 2, 3, ..., 10). Em seguida, imprima todos os valores do vetor na tela.

*******************************************************************************/
import java.util.Scanner;
public class geral21
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.print("Digite dez valores: ");
       for (int i = 0; i < numeros.length; i++) {
             System.out.println("valores");
             numeros[i] = ler.nextInt();
    }
    for (int i = 0; i < numeros.length; i++) {
             System.out.println("O " + (i+1) + "º valor é: " + numeros[i]);
             
    }
}
}