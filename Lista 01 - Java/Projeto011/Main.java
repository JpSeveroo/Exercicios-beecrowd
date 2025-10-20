import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        Double soma = 0.0;
        int notasAcima = 0;

        for(int i = 1; i <= 5; i++){
            System.out.print("Digite a " + i + "° nota: ");
            double nota = scanner.nextDouble();
            notas.add(nota);

            if (nota >= 7){
                notasAcima += 1;
            }
        }

        System.out.println("Lista de notas: " + notas);

        for (int i = 0; i < 5; i++){
            soma += notas.get(i);
        }

        System.out.println("Média da turma: " + soma/5);
        System.out.println("Notas acima da média: " + notasAcima);
        scanner.close();
    }
}
