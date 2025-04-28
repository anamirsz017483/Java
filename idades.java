/******************************************************************************
Leia a idade de cinco pessoas e exiba a soma e a média das idades. 
*******************************************************************************/
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int idade;
        int quantidade = 5;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();
            soma += idade;
        }

        double media = (double) soma / quantidade;

        System.out.println("Soma das idades: " + soma);
        System.out.println("Média das idades: " + media);

        
    }
}

