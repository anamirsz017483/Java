/******************************************************************************
O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa 
que leia as um conjunto indeterminado de temperaturas, e informe ao
final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
*******************************************************************************/
import java.util.Scanner;

public class geral19 {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 1;
        int contador = 1;
       double temperatura; 
        
        String condicao = "";
        
        while (!condicao.equals("sair")) {
            System.out.print("Temperatura " + (contador + 1) + ": ");
            temperatura = ler.nextDouble();

            if (temperatura < 0) {
                break;
            }
            
            soma += temperatura;
            contador++;
            if (temperatura < menor ){
                menor = temperatura; 
            }
            if (temperatura > maior ) {
                maior = temperatura;
            }
            System.out.println("Digite as temperaturas (ou 'sair' para encerrar):");
            condicao = ler.next();
        }
        if(contador > 0){
            double media = soma / contador;
            System.out.println ("menor temperatura: "+ menor); 
            System.out.println("maior temperatura: "+ maior);
            System.out.println("media das temperatura: "+ media); 
        }else {
            System.out.println("nenhuma temperatura esta valida.");
        }
        }
}
               
