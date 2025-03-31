
/******************************************************************************
Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. 
Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de ll a 20 anos,
de 21 a 30 anos e maiores de 31 anos.
*******************************************************************************/
import java.util.Scanner;

public class faixaetaria 
{

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        
        double somaPesoFaixa1_10 = 0, somaPesoFaixa11_20 = 0, somaPesoFaixa21_30 = 0, somaPesoMaior31 = 0;
        int contFaixa1_10 = 0, contFaixa11_20 = 0, contFaixa21_30 = 0, contFaixaMaior31 = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            
            if (idade >= 1 && idade <= 10) {
                somaPesoFaixa1_10 += peso;
                contFaixa1_10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPesoFaixa11_20 += peso;
                contFaixa11_20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPesoFaixa21_30 += peso;
                contFaixa21_30++;
            } else if (idade >= 31) {
                somaPesoMaior31 += peso;
                contFaixaMaior31++;
            }
        }

        System.out.println("\nResultado:");

        if (contFaixa1_10 > 0) {
            double mediaPesoFaixa1_10 = somaPesoFaixa1_10 / contFaixa1_10;
            System.out.println("Média do peso das pessoas de 1 a 10 anos: " + mediaPesoFaixa1_10);
        } else {
            System.out.println("Não há pessoas na faixa de 1 a 10 anos.");
        }
        if (contFaixa11_20 > 0) {
            double mediaPesoFaixa11_20 = somaPesoFaixa11_20 / contFaixa11_20;
            System.out.println("Média do peso das pessoas de 11 a 20 anos: " + mediaPesoFaixa11_20);
        } else {
            System.out.println("Não há pessoas na faixa de 11 a 20 anos.");
        }
        if (contFaixa21_30 > 0) {
            double mediaPesoFaixa21_30 = somaPesoFaixa21_30 / contFaixa21_30;
            System.out.println("Média do peso das pessoas de 21 a 30 anos: " + mediaPesoFaixa21_30);
        } else {
            System.out.println("Não há pessoas na faixa de 21 a 30 anos.");
        }
        if (contFaixaMaior31 > 0) {
            double mediaPesoFaixaMaior31 = somaPesoMaior31 / contFaixaMaior31;
            System.out.println("Média do peso das pessoas com mais de 31 anos: " + mediaPesoFaixaMaior31);
        } else {
            System.out.println("Não há pessoas com mais de 31 anos.");
        }
    }
}