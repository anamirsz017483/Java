/******************************************************************************
 Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.
*******************************************************************************/
import java.util.Scanner;
public class Ex6
{
    public static void main (String [] args ){ 
        int numero;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("insira um numero inteiro qualquer:");
       numero = ler.nextInt ();
       
       if (numero %2 == 0)
       System.out.println("o numero vai ser par:");
       else 
       System.out.println("o numero vai ser impar:");
}
}