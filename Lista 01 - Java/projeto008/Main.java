import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pedido pedido1 = new Pedido(1, 200, "21/10/2025", "João Pedro");
        Pedido pedido2 = new Pedido(2, 620, "25/10/2025", "Eduardo");
        Pedido pedido3 = new Pedido(3, 700, "26/10/2025", "Carlos");
        Pedido pedido4 = new Pedido(4, 725, "28/10/2025", null);
        Pedido pedido5 = new Pedido(5, 875, "29/10/2025", "Murilo");
        Pedido pedido6 = new Pedido(6, 900, "30/10/2025", "André");

        //Por ser exercício de sala de aula não há necessidade de fazer escaonamento de pedidos.
        //Se quisesse era só desenvolver mais uma classe pra fazer a leitura de pedidos e ir adicionando nessalista abaixo.
        //E se fosse projeto grande era só buscar num banco de dados.
        //Outro detalhe é que poderia haver uma função de gerar o token no próprio Sistema mas decidi manter a simplicidade do desafio
        
        List<Pedido> pedidos = Arrays.asList(pedido1, pedido2, pedido3, pedido4, pedido5, pedido6);

        boolean sairSistema = false;

        while (!sairSistema) {
            System.out.println("\n===== SISTEMA DE PEDIDOS ONLINE =====");
            System.out.print("ID DO PEDIDO: ");
            int id = scanner.nextInt();

            Pedido pedidoSelecionado = null;
            for (Pedido p : pedidos) {
                if (p.getIdPedido() == id) {
                    pedidoSelecionado = p;
                    break;
                }
            }

            if (pedidoSelecionado == null) {
                System.out.println("Pedido não encontrado. Tente novamente.");
                continue; // volta para o início do loop
            }

            boolean voltarMenuPedido = false;
            while (!voltarMenuPedido) {
                pedidoSelecionado.painelDeEscolhas();
                System.out.print("\nDigite a opção da operação desejada: ");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Status: " + pedidoSelecionado.getStatus());
                        break;
                    case 2:
                        System.out.printf("Valor: R$ %.2f%n", pedidoSelecionado.getValorTotal());
                        break;
                    case 3:
                        System.out.println("Data: " + pedidoSelecionado.getDataPedido());
                        break;
                    case 4:
                        System.out.println("Cliente: " + pedidoSelecionado.getCliente());
                        break;
                    case 5:
                        pedidoSelecionado.exibirDetalhes();
                        break;
                    case 6:
                        System.out.print("==== Digite o token de validação: ");
                        int token = scanner.nextInt();
                        pedidoSelecionado.setStatus(token);
                        break;
                    case 7:
                        System.out.println("Saindo do sistema... Até a próxima!");
                        sairSistema = true;
                        voltarMenuPedido = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

                if (!sairSistema) {
                    System.out.print("\nDeseja continuar com este pedido? (s/n): ");
                    String resp = scanner.next();
                    if (resp.equalsIgnoreCase("n")) {
                        voltarMenuPedido = true; // volta para escolher outro pedido
                    }
                }
            }
        }

        scanner.close();
    }
}
