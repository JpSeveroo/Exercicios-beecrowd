import java.util.Scanner;

public class EX1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                cont ++;
            }
        }

        System.out.printf(cont + " valores pares");
        scanner.close();
    }
}
