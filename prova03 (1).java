/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class prova03
{

     public static void main(String[] args) {
     Scanner ler = new Scanner (System.in);
      int numero;

         System.out.println ("Digite um número inteiro: ");
          numero = ler.nextInt ();
         if (numero <= 1) {
         System.out.println ("O número digitado não é primo");
         } else {
         boolean divisivel = false; 
         for (int i = 2; i <= Math.sqrt(numero); i++) {
         if (numero % i == 0) {
         divisivel = true;
          break;
}
}
          if (divisivel) {
         System.out.println ("O número digitado não é primo");
         } else {
         System.out.println ("O número digitado é primo");

}

}

}

}