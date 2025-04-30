/******************************************************************************
Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
calcular a média alcançada por aluno e apresentar: A mensagem "Aprovado", 
se a média alcançada for maior ou igual a sete; A mensagem "Reprovado",
se a média for menor do que sete; A mensagem "Aprovado com Distinção", se a média for igual a dez
*******************************************************************************/
import java.util.Scanner; 
public class geral12{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = ler.nextDouble();
        double media = (n1 + n2) / 2;
        if (media == 10.0) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

       
    }
}
    
    

