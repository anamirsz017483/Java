/******************************************************************************
Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.
*******************************************************************************/
import java.util.Scanner; 
public class matriz01 {
    
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
        
     int[][] matriz = new int[5][5];
        int contadorPares = 0;
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;


            if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                
            }
                }

            }
            System.out.println ("A quantidade de numero pares em matriz:" + contadorPares++);

}
}
}


 