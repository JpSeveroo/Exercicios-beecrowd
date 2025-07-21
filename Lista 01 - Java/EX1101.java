import java.util.Scanner;

public class EX1101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            if (m <= 0 || n <= 0){
                break;
            }

            int maior, menor;
            if (m > n) {
                maior = m;
                menor = n;
            } else {
                maior = n;
                menor = m;
            }

            int soma = 0;

            for (int i=menor;i<=maior;i++){
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum="+soma);
        }
        scanner.close(); 
    }
}

