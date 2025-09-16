import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== BANCO NEW LIFE =====");
        System.out.print("Nome do titular: ");
        String entrada1 = scanner.nextLine();
        System.out.print("Conta: ");
        String entrada2 = scanner.nextLine();

        Conta conta = new Conta(entrada1, entrada2, 0);
        boolean cond = true;

        while (cond) {
            System.out.println("\n===== MENU =====");
            System.out.println("[1] Sacar");
            System.out.println("[2] Depositar");
            System.out.println("[3] Sair");
            System.out.print("Digite a operação desejada: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> {
                    System.out.print("Valor de saque: ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                }
                case 2 -> {
                    System.out.print("Valor de depósito: ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                }
                case 3 -> {
                    cond = false;
                    System.out.println("Obrigado por usar o Banco New Life!");
                }
                default -> System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        //Posso usar "->" pra evitar o uso de break a cada finalde caso.
        scanner.close();
    }
}
