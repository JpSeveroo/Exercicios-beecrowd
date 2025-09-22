public class Alimento extends Produto{
    //Private só vai ter acesso nessa classe
    //Protected vai dar acesso aos arquivos do mesmo projeto
    private String dataValidade;

    public Alimento(String codigo, String nome, double preco, String dataValidade){
        super(nome, codigo, preco);
        this.dataValidade = dataValidade;
    }

    public String getdataValidade(){
        return dataValidade;
    }

    public void mostrarDados(int dias){
        super.mostrarDados();
        System.out.println("Validade " + getdataValidade());
        if (dias > 30){
            System.out.println("Péssima notícia, seu produto passou da data de validade!!!");
        }
    }
}
