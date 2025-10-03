package gestaoVeiculos;
public class Veiculo {
    Sorteador sorteador = new Sorteador();

    protected String placa,marca;
    protected double preco;

    public Veiculo(String placa, String marca, double preco){
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public double getPreco(){
        return preco;
    }

    public void mostrarDados(){
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: " + getPreco());
    }

    public void mostrarDadosComDesconto() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        if (sorteador.getRandom() > 5) {
            System.out.println("Preço (com desconto): " + getPreco()*0.5);
        } else {
            System.out.println("Preço: " + getPreco());
        }
    }
}
