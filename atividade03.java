/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class atividade03 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[][] matriz = new int[5][5];
Map<Integer, Integer> contador = new HashMap<>();

System.out.println("Digite os elementos da matriz 5x5:");
for (int i = 0; i < 5; i++) {
for (int j = 0; j < 5; j++) {
System.out.print("Elemento [" + i + "][" + j + "]: ");
matriz[i][j] = scanner.nextInt();


contador.put(matriz[i][j], contador.getOrDefault(matriz[i][j], 0) + 1);
}
}

System.out.println("\nMatriz digitada:");
for (int[] linha : matriz) {
for (int valor : linha) {
System.out.print(valor + "\t");
}
System.out.println();
}

System.out.println("\nNúmeros repetidos:");
boolean repetido = false;
for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
if (entry.getValue() > 1) {
System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vezes");
repetido = true;
}
}

if (!repetido) {
System.out.println("Nenhum número repetido encontrado.");
}

}
}