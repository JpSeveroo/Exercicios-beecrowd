import java.util.Scanner;

public class EX1164 {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            int testes = scanner.nextInt();
            for (int i = 0; i < testes;i++){
                int valor = scanner.nextInt();
                int soma = 0;

                for (int j = 1; j < valor; j++){
                    if (valor % j == 0){
                        soma += j;
                    }
                }

                if (soma == valor) {
                    System.out.println(valor + " eh perfeito");
                }else{
                    System.out.println(valor + " nao eh perfeito");
                }
            }
            scanner.close();
        }
    }
}
