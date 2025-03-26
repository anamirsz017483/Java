/*
Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.
*/

import java.util.Scanner ;
public class Ex01
{
    public static void main (String [] args ) {
        double m1, m2, nota , soma; 
        Scanner ler = new Scanner (System.in);
        
        System.out.println("insira a nota da primeira da prova: ");
        m1 = ler.nextDouble ();
        System.out.println("insira a nota da segunda prova: ");
        m2 = ler.nextDouble ();
        
        soma =  (m1 + m2) / 2;
    
    if (soma >= 7 )
    System.out.println("Aluna(o) foi aprovada(o): ");
    else 
    System.out.println("Aluna|(o) foi reprovada(o): "); 
    
    }
}
