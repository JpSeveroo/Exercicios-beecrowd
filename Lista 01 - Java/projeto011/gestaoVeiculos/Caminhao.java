package gestaoVeiculos;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;
    private boolean mostrarExtras;

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga, boolean mostrarExtras){
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.mostrarExtras = mostrarExtras;
    }

    public double getCapacidade(){
        return capacidadeCarga;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        if(mostrarExtras){
            System.out.println("Capacidade de carga: " + getCapacidade());
        }
    }

}
