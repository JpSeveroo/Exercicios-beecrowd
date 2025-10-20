import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("--- Leitura da Matriz 3x3 ---");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Matriz Digitada---");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%4d", matriz[i][j]); 
            }
            System.out.println();
        }

        scanner.close();
    }
}
