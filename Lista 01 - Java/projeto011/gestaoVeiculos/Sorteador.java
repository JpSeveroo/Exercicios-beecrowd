package gestaoVeiculos;
import java.util.Random;

public class Sorteador{
    Random random = new Random();
    private int numeroAleatorio;

    public Sorteador(){
        numeroAleatorio = random.nextInt(10)+1;
    }

    public int getRandom(){
        return numeroAleatorio;
    }
    
}