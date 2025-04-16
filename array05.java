/******************************************************************************
 Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em 
um terceiro vetor e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;

public class array05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorSoma = new int[10];

       
        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        
        System.out.println("Digite os 10 elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

       
        System.out.println("Vetor resultado da soma (A + B):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Soma[" + i + "] = " + vetorSoma[i]);
        }

        
    }
}
