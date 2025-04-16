/******************************************************************************
Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;

public class array04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double soma = 0;

        
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 1; i < numeros.length; i += 2) {
            soma += numeros[i];
        }

        System.out.printf("\nSoma dos valores nas posições ímpares: %.2f\n", soma);

       
    }
}
