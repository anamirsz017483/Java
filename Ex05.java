/******************************************************************************
 . Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.
*******************************************************************************/
import java.util.Scanner;
public class Ex05 
{
    public static void main (String [] args ){ 
        int ve, np, ss;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("insira o valor do emprestimo:");
        ve = ler.nextInt();
        
        System.out.println("insira o valor de parcela:") ;
        np = ler.nextInt();
        
        System.out.println("insira o salario do solicitante");
        ss = ler.nextInt ();
        
        if (np <= (ss - 0.30))
        System.out.println("o emprestimo sera aceito:");
        else 
        System.out.println("o emprestimo nao sera aprovado:");
 }
}