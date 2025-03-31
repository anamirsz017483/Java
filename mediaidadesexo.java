/******************************************************************************
Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 
*******************************************************************************/
import java.util.Scanner;

public class mediaidadesexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int somaIdadesMulheres = 0;
        int somaIdadesHomens = 0;
        int contMulheres = 0;
        int contHomens = 0;
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Digite o sexo (M – Masculino, F – Feminino): ");
            char sexo = scanner.nextLine().charAt(0);
               somaIdades += idade;

            if (sexo == 'F' || sexo == 'f') {
                somaIdadesMulheres += idade;
                contMulheres++;
            } else if (sexo == 'M' || sexo == 'm') {
                somaIdadesHomens += idade;
                contHomens++;
            }
        }

        System.out.println("\nResultado:");
        double mediaIdadeGrupo = (double) somaIdades / 7;
        System.out.println("Idade média do grupo: " + mediaIdadeGrupo);

        if (contMulheres > 0) {
            double mediaIdadeMulheres = (double) somaIdadesMulheres / contMulheres;
            System.out.println("Idade média das mulheres: " + mediaIdadeMulheres);
        } else {
            System.out.println("Não há mulheres no grupo.");
        }
        if (contHomens > 0) {
            double mediaIdadeHomens = (double) somaIdadesHomens / contHomens;
            System.out.println("Idade média dos homens: " + mediaIdadeHomens);
        } else {
            System.out.println("Não há homens no grupo.");
        }

    }
}