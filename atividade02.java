/******************************************************************************
Faça um programa que leia uma matriz 3x4 de inteiros, substitua seu
s elementos negativos por 0 e imprima a matriz original e a modificada.
*******************************************************************************/
import java.util.Scanner;

public class atividade02 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
int[][] matriz = new int[3][4];
int[][] matrizModificada = new int[3][4];

System.out.println("Digite os elementos da matriz 3x4:");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 4; j++) {
System.out.print("matriz[" + i + "][" + j + "] = ");
matriz[i][j] = ler.nextInt();
matrizModificada[i][j] = matriz[i][j] < 0 ? 0 : matriz[i][j];
}
}

System.out.println("\nMatriz original:");
for (int[] linha : matriz) {
for (int valor : linha) {
System.out.print(valor + "\t");
}
System.out.println();
}

System.out.println("\nMatriz modificada (negativos substituídos por 0):");
for (int[] linha : matrizModificada) {
for (int valor : linha) {
System.out.print(valor + "\t");
}
System.out.println();
}

}
}