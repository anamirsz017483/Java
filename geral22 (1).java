/******************************************************************************
Exercicio 022
Crie um vetor de 5 números inteiros, preencha com valores de sua escolha e 
calcule a soma de todos os elementos desse vetor. Exiba o resultado.
*******************************************************************************/
import java.util.Scanner;
public class geral22
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
        System.out.print("Digite cinco valores: ");
        numeros[i] = ler.nextInt();
    }
        for (int i = 0; i < numeros.length; i++) {
             soma += numeros[i];
             System.out.println("A soma dos números é igual a: "+soma);
             
        }  
}
}