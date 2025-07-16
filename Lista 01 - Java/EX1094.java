import java.util.Scanner;

public class EX1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testes = scanner.nextInt();
        int coelhos = 0;
        int sapos = 0;
        int ratos = 0;
        int total = 0;

        for (int i = 0; i < testes; i++) {
            int quant = scanner.nextInt();
            String cobaia = scanner.next();

            total += quant;

            if (cobaia.equals("C")) {
                coelhos += quant;
            } else if (cobaia.equals("S")) {
                sapos += quant;
            } else if (cobaia.equals("R")) {
                ratos += quant;
            }
        }
        scanner.close();

        double percentC = (double) coelhos * 100 / total;
        double percentR = (double) ratos * 100 / total;
        double percentS = (double) sapos * 100 / total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentS);
    }
}

