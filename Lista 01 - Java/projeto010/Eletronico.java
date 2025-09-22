public class Eletronico extends Produto{

    private int garantia;

    public Eletronico(String nome, String codigo, double preco, int garantia){
        super(nome, codigo, preco);
        this.garantia = garantia;
    }

    public int getgarantia(){
        return garantia;
    }

    public void mostrarDados(boolean temp){
        super.mostrarDados();
        if (temp == true){
            System.out.println("Garantia: " + getgarantia());
        }else{
            System.out.println("Garantia: " + getgarantia()*12);
        }
    }
}