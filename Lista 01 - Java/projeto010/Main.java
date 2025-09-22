import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alimento miojo = new Alimento("666", "Miojo", 3.50, "21/10/2025");
        Alimento sushi = new Alimento("777", "Barca de Sushi", 79.90, "29/09/2025");

        Eletronico celular = new Eletronico("LG K10", "995", 120.99, 3);
        Eletronico mouse = new Eletronico("Mouse RedDragon", "443", 499.90, 2);

        Vestuario calcinha = new Vestuario("Calcinha de Renda", "Preta", "069", 99.99, "XG");
        Vestuario ceroula = new Vestuario("Ceroula", "Azul", "111", 89.90, "XG");

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MENU DO SISTEMA =====");
        System.out.println("[1] Alimento");
        System.out.println("[2] Eletrônico");
        System.out.println("[3] Vestuário");
        System.out.print("Qual produto você quer visualizar? ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("\nProdutos disponíveis:");
            System.out.println("[1] Miojo");
            System.out.println("[2] Sushi");
            int escolha1 = scanner.nextInt();
            switch (escolha1) {
                case 1:
                    System.out.print("Informe os dias desde a compra/até a validade: ");
                    int dias1 = scanner.nextInt();
                    miojo.mostrarDados(dias1);
                    break;
                case 2:
                    System.out.print("Informe os dias desde a compra/até a validade: ");
                    int dias2 = scanner.nextInt();
                    sushi.mostrarDados(dias2);
                    break;
                default:
                    System.out.println("Entrada inválida");
                    break;
            }
        } else if (escolha == 2) {
            System.out.println("\nProdutos disponíveis:");
            System.out.println("[1] LG K10");
            System.out.println("[2] Mouse RedDragon");
            int escolha2 = scanner.nextInt();
            switch (escolha2) {
                case 1:
                    celular.mostrarDados();
                    break;
                case 2:
                    mouse.mostrarDados();
                    break;
                default:
                    System.out.println("Entrada inválida");
                    break;
            }
        } else if (escolha == 3) {
            System.out.println("\nProdutos disponíveis:");
            System.out.println("[1] Calcinha");
            System.out.println("[2] Ceroula");
            int escolha3 = scanner.nextInt();
            switch (escolha3) {
                case 1:
                    calcinha.mostrarDados();
                    break;
                case 2:
                    ceroula.mostrarDados();
                    break;
                default:
                    System.out.println("Entrada inválida");
                    break;
            }
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
