import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Vou manter produtos/objetos fixos por preguiça
        //Poderia sim criar um sistema de criação de produto, verificar se o produto existe blablabla... Sossega ai nego.
        Produto produto1 = new Produto("Sabão em pó", 7.5, 40);

        boolean condition = true;
        while (condition) {
            produto1.exibirPainel();
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("----- Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    produto1.setQuantidadeEmEstoque(novaQuantidade);
                    break;
                case 2:
                    System.out.print("----- Novo preço: ");
                    int novoPreco = scanner.nextInt();
                    produto1.setQuantidadeEmEstoque(novoPreco);
                    break;
                case 3:
                    produto1.exibirDetalhes();
                    break;
                case 4:
                    condition = false;
                    break;
                default:
                    System.out.println("\nOpção inválida, digite novamente.");
                    break;
            }
        }
        scanner.close();
    }
}