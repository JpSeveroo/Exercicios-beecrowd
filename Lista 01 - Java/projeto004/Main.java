package projeto004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===== BEM-VINDO AO BANCO NOVO =====\n");
        System.out.print("Digite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite o número da sua conta: ");
        int contaUsuario = scanner.nextInt();

        Acao minhaConta = new Acao(nomeUsuario, contaUsuario, 1000);

        int escolha;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("O que você gostaria de fazer hoje?");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Ver saldo");
            System.out.println("[4] Sair");
            System.out.print("Sua escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um valor para depósito: ");
                    double valorDep = scanner.nextDouble();
                    minhaConta.depositar(valorDep);
                    break;
                
                case 2:
                    System.out.println("Digite um valor de saque: ");
                    double valorsaq = scanner.nextDouble();
                    minhaConta.depositar(valorsaq);
                
                case 3:
                    minhaConta.exibirSaldo();
                    break;

                case 4:
                    System.out.println("Obrigado por usar nossos serviços! Até mais.");
                    break;
                default:
                    System.out.println("\nEscolha inválida. Por favor, tente novamente.");
                    break;
            }
        } while (escolha != 4);

        scanner.close();
    }
}
