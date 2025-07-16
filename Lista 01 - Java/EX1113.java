import java.util.Scanner;

public class EX1113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean cond = true;

        while (cond){
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a == b){
                cond = false;
            }
            else{
                if (a > b){
                    System.out.println("Decrescente");
                }
                else{
                    System.out.println("Crescente");
                }
            }
        }
        scan.close();
    }
}
