package gestaoBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- CADASTRO DE CONTAS BANCÁRIAS ---");
            System.out.println("Escolha o tipo de conta a ser cadastrada:");
            System.out.println("1 -> Conta Corrente");
            System.out.println("2 -> Conta Poupança");
            System.out.println("3 -> Conta Investimento");
            System.out.println("0 -> Encerrar o programa");
            System.out.print("Digite sua opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite o número da conta: ");
                String numero = scanner.nextLine();
                System.out.print("Digite o nome do titular: ");
                String titular = scanner.nextLine();
                System.out.print("Digite o saldo inicial: R$ ");
                double saldo = scanner.nextDouble();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o limite do cheque especial: R$ ");
                        double limite = scanner.nextDouble();
                        ContaCorrente cc = new ContaCorrente(numero, titular, saldo, limite);
                        cc.mostrarDados(true); 
                        break;
                    
                    case 2:
                        System.out.print("Digite a taxa de rendimento mensal (%): ");
                        double rendimento = scanner.nextDouble();
                        ContaPoupanca cp = new ContaPoupanca(numero, titular, saldo, rendimento);
                        cp.mostrarDados(true);
                        break;

                    case 3:
                        System.out.print("Digite a taxa de administração (%): ");
                        double taxaAdm = scanner.nextDouble();
                        ContaInvestimento ci = new ContaInvestimento(numero, titular, saldo, taxaAdm);
                        ci.mostrarDados(true);
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("\nSistema finalizado. Obrigado por utilizar nossos serviços!");
        scanner.close();
    }
}