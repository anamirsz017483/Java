/******************************************************************************
Tendo como dados de entrada a altura de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
*******************************************************************************/
import java.util.Scanner; 
public class geral07{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    double altura, ps; 
    
    System.out.println("mostre a altura da pessoa: ");
    altura = ler.nextDouble();
    ps = (72.7 * altura)-58;
    System.out.println("o peso ideal é de:"+ps); 
    }
}
