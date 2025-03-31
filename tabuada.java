/******************************************************************************


*******************************************************************************/
import java.util.Scanner;
public class tabuada {
    public static void main (String [] args ) {
        Scanner ler =  new Scanner (System.in);
        int n;
        
        System.out.println("escolha um numero: ");
        n = ler.nextInt ();
        
        System.out.println("tabuada do"+ n+ ":");
        for(int i =1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}