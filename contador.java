/******************************************************************************
Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos estão entre 0 e 100.
*******************************************************************************/
import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0; // Para contar quantos números estão entre 0 e 100

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contador);

    }
}

