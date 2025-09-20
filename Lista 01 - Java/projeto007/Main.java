import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Biblioteca Municipal =====");
        System.out.println("[SISTEMA] O que deseja fazer?");
        System.out.println("[1] Pegar");
        System.out.println("[2] Devolver");

        int decisao = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt

        System.out.print("Qual o nome da obra? ");
        String entradaLivro = scanner.nextLine();

        System.out.print("Qual o nome do autor? ");
        String entradaAutor = scanner.nextLine();

        Livro livro = new Livro(entradaLivro, entradaAutor, false);

        if (decisao == 1) {
            livro.emprestar();
            System.out.println("Você pegou o livro \"" + livro.getTitulo() + "\" de " + livro.getAutor());
        } else if (decisao == 2) {
            livro.devolver();
            System.out.println("Você devolveu o livro \"" + livro.getTitulo() + "\" de " + livro.getAutor());
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

