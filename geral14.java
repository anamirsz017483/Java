/******************************************************************************
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*******************************************************************************/
import java.util.Scanner;

public class geral14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();
        double percentual = 0;
        if (salarioAtual <= 280) {
            percentual = 20;
        } else if (salarioAtual <= 700) {
            percentual = 15;
        } else if (salarioAtual <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }
        double valorAumento = salarioAtual * (percentual / 100);
        double novoSalario = salarioAtual + valorAumento;
        System.out.println("\n===== Reajuste Salarial =====");
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentual);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário, após o aumento: R$ %.2f%n", novoSalario);

    }
}
