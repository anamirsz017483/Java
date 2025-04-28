/******************************************************************************
Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.
*******************************************************************************/
import java.util.Scanner;

public class maioresquedez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int numero;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            if (numero > 10) {
                contador++;
            }
        }

        System.out.println("Quantidade de números maiores que 10: " + contador);

        
    }
}

