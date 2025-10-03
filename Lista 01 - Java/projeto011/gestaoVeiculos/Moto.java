package gestaoVeiculos;

public class Moto extends Veiculo{
    private int cilindradas;
    private boolean mostrarExtras;

    public Moto(String placa, String marca, double preco, int cilindradas, boolean mostrarExtras){
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
        this.mostrarExtras = mostrarExtras;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        if(mostrarExtras){
            System.out.println("Cilindradas: " + getCilindradas());
        }
    }
}
