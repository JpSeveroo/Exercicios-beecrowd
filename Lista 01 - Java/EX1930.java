import java.util.Scanner;

public class EX1930 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1, t2, t3, t4;

        t1 = scanner.nextInt();
        t2 = scanner.nextInt();
        t3 = scanner.nextInt();
        t4 = scanner.nextInt();

        int soma = (t1-1) + (t2-1) + (t3-1) + t4;
        System.out.println(soma);

        scanner.close();
    }
}
