/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Repeticao01 {
    public static void main (String [] args) {
        Scanner ler =  new Scanner (System.in);
        int n;
        
        System.out.println("digite um numero maior que zero:" ) ; 
        n = ler.nextInt () ;
        
        for (int i = 0; i <= n;  i++)
         System.out.println("numero:" +i );
    }
}
