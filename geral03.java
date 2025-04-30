/******************************************************************************
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
*******************************************************************************/
import java.util.Scanner; 
public class geral03{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    double n1, n2, n3, n4, soma;
    
    System.out.println("entre com a primeira nota: ");
    n1 = ler.nextDouble();
    System.out.println("entre com a segunda nota: ");
    n2 = ler.nextDouble();
    System.out.println("entre com a terceira nota: ");
    n3 = ler.nextDouble();
    System.out.println("entre com a quarta nota: ");
    n4 = ler.nextDouble();
     soma  = (n1 + n2+ n3 + n4)/4;
    System.out.println("a media dos aluno(a) é:"+ soma ); 
    }
}
