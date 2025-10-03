package gestaoVeiculos;

public class Carro extends Veiculo{
    private int numPortas;
    private boolean mostrarExtras;

    public Carro(String placa, String marca, double preco, int numPortas, boolean mostrarExtras){
        super(placa, marca, preco);
        this.numPortas = numPortas;
        this.mostrarExtras = mostrarExtras;
    }

    public int getNumeroPortas(){
        return numPortas;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        if (mostrarExtras){
            System.out.println("Número de Portas: " + getNumeroPortas());
        }
    }
}
