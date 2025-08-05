import java.util.Scanner;

public class Projeto001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nConversor de Temperatura");
        System.out.println("=========================");
        System.out.println("Escolha uma opção:");
        System.out.println("[1] Celsius ---> Farenheit");
        System.out.println("[2] Farenheit ---> Celsius");

        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        if ((opcao != 1)&&(opcao != 2)){
            System.out.println("\nOpção incorreta. Tente novamente!\n");
        }else{
            System.out.println("\nQual o valor a ser calculado? ");
            Double valor = scanner.nextDouble();
            if (opcao == 1){
                Double calculo = (valor * (9/5)) + 32;
                System.out.printf("Resultado: %.2f%n", calculo);
            }else{
                Double calculo = (valor - 32) / 1.8;
                System.out.printf("Resultado: %.2f%n", calculo);
            }
        }
        scanner.close();
    }
}