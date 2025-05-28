/******************************************************************************
Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
*******************************************************************************/
import java.util.Scanner; 
public class matriz02 {
    
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
        int [][]matriz= new int [3][3];
        
        System.out.println ("digite  os numeros da matriz 3x3:");
        for  (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                
                matriz [i][j] = ler.nextInt ();
            }
        }
        System.out.println ("calcule a soma das colunas:");
        for (int j = 0; j<3; j++){
            int somacoluna =0;
            for (int i=0; i<3; i++){
                somacoluna += matriz [i][j];
            }
            System.out.println ("soma coluna " + (j + 1) + "=" + somacoluna) ;
        }
    }
}