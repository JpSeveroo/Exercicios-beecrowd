package projeto005;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===== Tela de login =====\n");
        System.out.print("Digite a marca do seu automóvel: ");
        String minhaMarca = scanner.nextLine();
        System.out.print("Digite o modelo do seu automóvel: ");
        String meuModelo = scanner.nextLine();
        System.out.print("Digite o ano do seu automóvel: ");
        int meuAno = scanner.nextInt();

        int minhaVelocidade = 0;
        Carro carro = new Carro(minhaMarca, meuModelo, meuAno, minhaVelocidade);

        int escolha;

        do {
            System.out.println("\n======= PAINEL AUTOMOTIVO =======");
            System.out.println("O que você gostaria de fazer hoje?");
            System.out.println("[1] Acelerar");
            System.out.println("[2] Frear");
            System.out.println("[3] Ver status do carro");
            System.out.println("[4] Sair do painel");
            System.out.print("Sua escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite um valor de aceleração em km/h: ");
                    int valorAcrescentado = scanner.nextInt();
                    carro.acelerar(valorAcrescentado);
                    break;
                
                case 2: 
                    System.out.print("\nDigite o valor de frenagem em km/h: ");
                    int valorDecrescido = scanner.nextInt();
                    carro.frear(valorDecrescido);
                    break;
                case 3:
                    carro.exibirStatus();
                    break;
                case 4:
                    System.out.println("\nObrigado por usar o Painel Automotivo. Até mais!");
                    break;
                default:
                    System.out.println("\nEscolha inválida. Tente novamente mais tarde.");
                    break;
            } 
        } while (escolha != 4);

        scanner.close();
    }
}
