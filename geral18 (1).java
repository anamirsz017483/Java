/******************************************************************************
Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
*******************************************************************************/
import java.util.Scanner;

public class geral18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();
        System.out.println("Números no intervalo entre " + n1 + " e " + n2 + ":");
        if (n1 == n2 || Math.abs(n1 - n2) == 1) {
            System.out.println("Não há números no intervalo.");
        } else {
            int inicio = Math.min(n1, n2) + 1;
            int fim = Math.max(n1, n2);

            for (int i = inicio; i < fim; i++) {
                System.out.println(i);
            }
        }

        
    }
}
