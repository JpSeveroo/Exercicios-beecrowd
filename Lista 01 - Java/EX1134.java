import java.util.Scanner;

public class EX1134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool_1 = 0;
        int diesel_3 = 0;
        int gasolina_2 = 0;
        boolean control_4 = true;

        while (control_4){
            int ent = scanner.nextInt();

            if (ent == 1){
                alcool_1++;
            } else if (ent == 2) {
                gasolina_2++;
            } else if (ent == 3) {
                diesel_3++;
            } else if (ent == 4) {
                control_4 = false;
            }
        }
        scanner.close();
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ alcool_1);
        System.out.println("Gasolina: "+ gasolina_2);
        System.out.println("Diesel: "+ diesel_3);
    }
}