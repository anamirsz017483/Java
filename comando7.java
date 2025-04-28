/******************************************************************************
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
informado pelo usuário, utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.
Ex:
Base: 2
Expoente:7 
Resultado:128

Base: 5
Expoente:3 
Resultado:125
*******************************************************************************/
import java.util.Scanner;

public class comando7
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

       
        System.out.println("Resultado: " + resultado);

        
    }
}

