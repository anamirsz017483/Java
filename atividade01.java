/******************************************************************************
Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada
*******************************************************************************/
import java.util.Scanner;

public class atividade01 {
public static void main(String[] args) {
 Scanner ler  = new Scanner(System.in);
int [][] matriz = new int [4][4];

System.out.println("Digite os elementos da matriz 4x4:");
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
System.out.print("matriz[" + i + "][" + j + "] = ");
matriz[i][j] = ler.nextInt();
}
}

int linhas = matriz.length;
int colunas = matriz[0].length;
System.out.print("Número de linhas: " + linhas);
System.out.print("Número de colunas: " + colunas);

System.out.print("Matriz formatada:");
for (int[] linha : matriz) {
for (int valor : linha) {
System.out.print(valor + "\t");
}
System.out.println();
}

}
}