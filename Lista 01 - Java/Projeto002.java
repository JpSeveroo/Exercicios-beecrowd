import java.util.Random;
import java.util.Scanner;

public class Projeto002 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuarJogo = true;

        while (continuarJogo){
            int numeroRandom = new Random().nextInt(100) + 1;
            int tentativas = 0;
            int palpites = 0;

            System.out.println("Estou pensando em um numero entre 1 e 100. Tente adivinha-lo!");

            while (true){
                System.out.println("Seu palpite: ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite == numeroRandom){
                    break;
                }else if (palpite < numeroRandom){
                    System.out.println("Tente um número maior.");
                }else {
                    System.out.println("Tente un número menor.");
                }
            }
            System.out.printf("Parabens! Voce acertou o numero em %n tentativas.%n", tentativas);
            System.out.println("Quer tentar novamente? [s/n]");
            String escolha = scanner.next();

            if (escolha.equalsIgnoreCase("n")) {
                continuarJogo = false;
            }
        }
        scanner.close();
        System.out.println("Obrigado por jogar! Ate mais.");
    }
}
