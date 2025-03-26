/*
 Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.
*/

import java.util.Scanner ;
public class Ex03
{
    public static void main (String [] args ) {
        double n1, n2 ,n3 ; 
        
        Scanner ler =  new Scanner(System.in); 
        System.out.println("entre com o primeiro numero:");
        n1 = ler.nextInt();
        
        System.out.println("entre com o segundo numero:");
        n2 = ler.nextInt();
        
        System.out.println("entre com o terceiro numero:");
        n3 = ler.nextInt (); 
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("o primeiro numero é maior:" + n1);
        }else if (n2 > n1 && n2 > n3){
        System.out.println("o segundo numero é maior:" + n2);
        }else { 
        System.out.println("o terceiro numero é maior: " + n3);
        }
    }
}

    