/******************************************************************************
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês.
*******************************************************************************/
import java.util.Scanner; 
public class geral05{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    double  salariohora, horastrabalhadas ,  salariomes; 
    
    System.out.println("quanto voce ganha por hora?: "); 
    salariohora = ler.nextDouble();
    System.out.println("quanto horas voce trabalha por mes?: ");
    horastrabalhadas = ler.nextDouble(); 
    salariomes = horastrabalhadas * salariohora;
    System.out.println("o salario total do mes é: "+salariomes);
    }
}
