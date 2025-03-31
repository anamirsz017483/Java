/******************************************************************************
Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 
*******************************************************************************/
import java.util.Scanner;

public class caracteristicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countIdadePeso = 0;
        int totalIdadeMenorAltura = 0;
        int countPessoasMenorAltura = 0;
        int countOlhosAzuis = 0;
        int countRuivasSemOlhosAzuis = 0;

       
        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();
            
            scanner.nextLine();  

            System.out.print("Digite a cor dos olhos (A – Azul, P – Preto, V – Verde, C – Castanho): ");
            char corOlhos = scanner.nextLine().charAt(0);
            System.out.print("Digite a cor dos cabelos (P – Preto, C – Castanho, L – Louro, R – Ruivo): ");
            char corCabelos = scanner.nextLine().charAt(0);

            if (idade > 50 && peso < 60) {
                countIdadePeso++;
            }

            if (altura < 1.50) {
                totalIdadeMenorAltura += idade;
                countPessoasMenorAltura++;
            }

            if (corOlhos == 'A' || corOlhos == 'a') {
                countOlhosAzuis++;
            }

            if (corCabelos == 'R' || corCabelos == 'r') {
                if (corOlhos != 'A' && corOlhos != 'a') {
                    countRuivasSemOlhosAzuis++;
                }
            }
        }
        System.out.println("\nResultado:");

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + countIdadePeso);
        if (countPessoasMenorAltura > 0) {
            double mediaIdades = (double) totalIdadeMenorAltura / countPessoasMenorAltura;
            System.out.println("Média das idades das pessoas com altura inferior a 1,50 metros: " + mediaIdades);
        } else {
            System.out.println("Não há pessoas com altura inferior a 1,50 metros.");
        }

      
        double porcentagemOlhosAzuis = (countOlhosAzuis / 20.0) * 100;
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + countRuivasSemOlhosAzuis);

       
    }
}