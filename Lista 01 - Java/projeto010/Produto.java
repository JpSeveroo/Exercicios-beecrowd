public class Produto {
    Sorteador sorteador = new Sorteador();

    protected String codigo,nome;
    protected double preco;

    public Produto(String nome, String codigo, double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public double getPreco(){
        return preco;
    }

    public void mostrarDados(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
    }

    public void mostrarDados(double desconto){
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());

        if (sorteador.getRandom() > 5){
            System.out.println("Parabéns você foi o sorteado da vez para ganhar um mega desconto: ");
            System.out.println("Preço após desconto(50%): " + getPreco()*0.5);
        }else{
            System.out.println("Preço: " + getPreco());
        }
    }

    public void mostrarPergunta(){
        System.out.print("Qual produto você quer visualizar? ");
    }
}
