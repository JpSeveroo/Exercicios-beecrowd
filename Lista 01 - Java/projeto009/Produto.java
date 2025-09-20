public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome(){
        return nome;
    }

    public int getQuant(){
        return quantidadeEmEstoque;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double newPreco){
        if (newPreco >= 0){
            this.preco = newPreco;
            System.out.println("Preço atualizado");
        } else {
            System.out.println("Preço inválido, tente novamente.\n");
        }
    }

    public void setQuantidadeEmEstoque(int newQuant){
        if (newQuant >= 0){
            this.quantidadeEmEstoque = newQuant;
            System.out.println("Quantidade em estoque atualizada");
        } else {
            System.out.println("Quantidade inválida, tente novamente.\n");
        }
    }

    public void exibirDetalhes(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: "+ getQuant());
    }

    public void exibirPainel(){
        System.out.println("===== SISTEMA NOVA ERA =====");
        System.out.println("[1] Alterar quantidade");
        System.out.println("[2] Alterar preço");
        System.out.println("[3] Exibir detalhes");
        System.out.println("[4] Sair");
        System.out.print("Opção: ");
    }
}
