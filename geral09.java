/******************************************************************************
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total
*******************************************************************************/
import java.util.Scanner; 
public class geral09{
    
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    double metros, litros, latas, precototal; 
    
    System.out.println("mostre o tamanho em metros quadrados da area a ser pintada: "); 
    metros =  ler.nextDouble(); 
    litros = metros /3;
    latas = litros /18; 
    precototal = latas * 80; 
    System.out.println("a quantidade de latas  necessaria é de: "+latas);
    System.out.println("o total a pagar pela as latas de tinta é de: "+ precototal);
    }
    }

