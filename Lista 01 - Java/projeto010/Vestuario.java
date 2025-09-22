public class Vestuario extends Produto{
    private String tamanho, cor;

    public Vestuario(String nome, String cor, String codigo, double preco, String tamanho){
        super(nome, codigo, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void mostrarDados(boolean cor){
        super.mostrarDados();
        System.out.println("Tamanho: " + getTamanho());
        if (cor == true){
            System.out.println("Cor: " + getCor());
        }
    }
}
