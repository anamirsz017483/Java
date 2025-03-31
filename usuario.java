/******************************************************************************
leia o nome do usuario e escreva o nome dele na tela 10 vezes.

*******************************************************************************/
import java.util.Scanner;

public class usuario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
       
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome);
        }
        
     
        scanner.close();
    }
}