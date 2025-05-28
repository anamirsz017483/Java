/******************************************************************************
Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)
*******************************************************************************/
import java.util.Scanner; 
public class matriz04 {
    
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
       int[][] matriz = new int[6][3];

        System.out.println("Digite os elementos da matriz 6x3:");
        System.out.print("Elemento [0][0]: ");
        matriz[0][0] = ler.nextInt();
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < 6; i++) {
            for (int j = (i == 0 ? 1 : 0); j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("\nMaior elemento da matriz: " + maior);

        System.out.println("Menor elemento da matriz: " + menor);

       

    }

}