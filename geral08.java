/******************************************************************************
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*******************************************************************************/
import java.util.Scanner; 
public class geral08{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    double peixe, multa, total; 
    
    System.out.println("mostre a quantidade de peixe:" );
    peixe = ler.nextDouble(); 
    if(peixe > 50) {
        total = peixe - 50; 
        multa = total  * 4 ;
        
        System.out.println("a multa de pagar é:"+multa);
    }else{
        System.out.println("nao precisa pagar a multa: "); 
    }
    }
    }

