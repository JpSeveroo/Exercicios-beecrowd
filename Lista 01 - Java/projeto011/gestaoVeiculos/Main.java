package gestaoVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

//Professora desculpa a repetição, mas eu tava com TANTA preguiça de refatorar isso que preferi deixar assim.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("\n1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("3 - Cadastrar Caminhão");
            System.out.println("4 - Listar Veículos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Placa: ");
                String placa = scanner.nextLine();
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                System.out.print("Número de portas: ");
                int portas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Deseja ver o número de portas? (s/n): ");
                boolean mostrarExtras = scanner.nextLine().equalsIgnoreCase("s");

                veiculos.add(new Carro(placa, marca, preco, portas, mostrarExtras));
                System.out.println("Carro cadastrado!");

            } else if (opcao == 2) {
                System.out.print("Placa: ");
                String placa = scanner.nextLine();
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                System.out.print("Cilindradas: ");
                int cilindradas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Deseja ver as cilindradas? (s/n): ");
                boolean mostrarExtras = scanner.nextLine().equalsIgnoreCase("s");

                veiculos.add(new Moto(placa, marca, preco, cilindradas, mostrarExtras));
                System.out.println("Moto cadastrada!");

            } else if (opcao == 3) {
                System.out.print("Placa: ");
                String placa = scanner.nextLine();
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                System.out.print("Capacidade de carga (t): ");
                double carga = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Deseja ver a capacidade de carga? (s/n): ");
                boolean mostrarExtras = scanner.nextLine().equalsIgnoreCase("s");

                veiculos.add(new Caminhao(placa, marca, preco, carga, mostrarExtras));
                System.out.println("Caminhão cadastrado!");

            } else if (opcao == 4) {
                if (veiculos.isEmpty()) {
                    System.out.println("Nenhum veículo cadastrado!");
                } else {
                    for (Veiculo v : veiculos) {
                        v.mostrarDadosComDesconto();
                        System.out.println("-------------------");
                    }
                }
            } else if (opcao == 5) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}

