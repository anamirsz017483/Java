/******************************************************************************
Exemplo de Funcionamento menu:
1. Criar nova conta 
2. Depositar 
3. Sacar 
4. Consultar saldo 
5. Sair
Escolha uma opção
*******************************************************************************/
import java.util.Scanner; 
public class banco {
    
         static String[] nomes = new String[5];
         static double[] saldos = new double[5];
           static int totalContas = 0;
          public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
           int opcao;

     do {
      System.out.println("\n1. Criar nova conta");
     System.out.println("2. Depositar");
     System.out.println("3. Sacar");
     System.out.println("4. Consultar saldo");
     System.out.println("5. Sair");
     System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine(); 

         switch (opcao) {
         case 1:
         criarConta(scanner);
         break;
         case 2:
         depositar(scanner);
          break;
          case 3:
         sacar(scanner);
           break;
         case 4:
         consultarSaldo(scanner);
          break;
         case 5:
           System.out.println("Saindo do sistema.");
          break;
         default:
          System.out.println("Opção inválida.");
           }

          } while (opcao != 5);

          }

            static void criarConta(Scanner scanner) {
           if (totalContas >= 5) {
           System.out.println("Limite de contas atingido.");
         return;
          }
          System.out.print("Digite o nome do usuário: ");
          nomes[totalContas] = scanner.nextLine();
         saldos[totalContas] = 0.0;
           System.out.println("Conta criada com sucesso! Número da conta: " + totalContas);
         totalContas++;
         }

          static void depositar(Scanner scanner) {
           System.out.print("Digite o número da conta: ");
          int numeroConta = scanner.nextInt();
         if (contaValida(numeroConta)) {
          System.out.print("Digite o valor do depósito: ");
          double valor = scanner.nextDouble();
          if (valor > 0) {
         saldos[numeroConta] += valor;
         System.out.println("Depósito realizado com sucesso.");
         } else {
         System.out.println("Valor inválido.");
          }
          } else {
          System.out.println("Conta não encontrada.");
            }
            }

           static void sacar(Scanner scanner) {
           System.out.print("Digite o número da conta: ");
           int numeroConta = scanner.nextInt();
            if (contaValida(numeroConta)) {
            System.out.print("Digite o valor do saque: ");
            double valor = scanner.nextDouble();
            if (valor > 0 && valor <= saldos[numeroConta]) {
            saldos[numeroConta] -= valor;
           System.out.println("Saque realizado com sucesso.");
         } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            }
          } else {
         System.out.println("Conta não encontrada.");
          }
           }

         static void consultarSaldo(Scanner scanner) {
         System.out.print("Digite o número da conta: ");
           int numeroConta = scanner.nextInt();
          if (contaValida(numeroConta)) {
          System.out.println("Titular: " + nomes[numeroConta]);
           System.out.println("Saldo: R$" + saldos[numeroConta]);
          } else {
         System.out.println("Conta não encontrada.");
          }
          }
         static boolean contaValida(int numeroConta) {
         return numeroConta >= 0 && numeroConta < totalContas;
         }
         }
         