 /******************************************************************************
 Crie um programa em Java que leia os nomes e idades de 5 pessoas e, após isso,
informe se cada pessoa é maior ou menor de idade.
*******************************************************************************/
import java.util.Scanner;
public class prova04
{
public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
String nome;
int idade;

for (int i=1; i<=5; i++){
    System.out.print("Digite o nome da " + i + "º pessoa: ");
    nome = ler.nextLine();
    System.out.println("Digite a idade da " + i + "º pessoa: ");
    idade = ler.nextInt();
    
    if (idade >= 18){
       System.out.println("A pessoa é de maior");
    }else{
       System.out.println("A pessoa é de menor");
    }
    //limpar o StringBuffer
    ler.nextLine();
}

}
}