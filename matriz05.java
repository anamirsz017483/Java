/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 
public class matriz05 {
    
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
       int[][] matriz1 = new int[5][2];
        int[][] matriz2 = new int[5][2];
        int[][] matrizSoma = new int[5][2];


        System.out.println("Digite os elementos da primeira matriz (5x2):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = ler.nextInt();
            }
        }
        System.out.println("Digite os elementos da segunda matriz (5x2):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Matriz resultante (Soma):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
