/******************************************************************************
Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 

*******************************************************************************/
import java.util.Scanner;

public class intervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int countEntre0e100 = 0;
        int countEntre101e200 = 0;
        int countMaiorQue200 = 0;

        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

         
            if (numero >= 0 && numero <= 100) {
                countEntre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                countEntre101e200++;
            } else if (numero > 200) {
                countMaiorQue200++;
            }
        }

       
        System.out.println("\nQuantidade de números entre 0 e 100: " + countEntre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + countEntre101e200);
        System.out.println("Quantidade de números maiores que 200: " + countMaiorQue200);

       
        
    }
}