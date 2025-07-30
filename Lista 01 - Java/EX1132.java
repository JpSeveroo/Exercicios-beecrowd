import java.util.Scanner;

public class EX1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int maior, menor, soma;
            if (a > b) {
                maior = a;
                menor = b;
            } else {
                maior = b;
                menor = a;
            }
        
        soma = 0;  
        for (int i = menor; i <= maior; i++){
            if (i % 13 != 0){
                soma += i;
            }
        }
        System.out.print(soma);
        scanner.close();
    }
}