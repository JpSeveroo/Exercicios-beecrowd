import java.util.Scanner;

public class EX1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cond = true;

        while (cond){
            int valor = scanner.nextInt();

            if (valor == 2002){
                System.out.println("Acesso Permitido");
                cond = false;
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
        scanner.close();
    }
}
