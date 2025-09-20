import java.util.Arrays;
import java.util.List;

public class Pedido {
    private int idPedido;
    private double valorTotal;
    private String dataPedido, cliente,status;

    public Pedido(int idPedido, double valorTotal, String dataPedido, String cliente){
        this.idPedido = idPedido;
        this.valorTotal = valorTotal;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.status = "Pendente";//Posso deixar esse atributo como fixo retirando ele de dentro do construtor e deixando ele fixo.
    }

    public int getIdPedido(){
        return idPedido;
    }

    public double getValorTotal(){
        return valorTotal;
    }
    
    public String getDataPedido(){
        return dataPedido;
    }

    public String getCliente(){
        return cliente;
    }

    public String getStatus(){
        return status;
    }

    //Aterar o set com validação e incrementar lógica de mudaça de status
    //Preferi alterar apenas o status de pendente pra processando, comparei minha ideia com a da professora e achei a dela muito banal

    private static final List<Integer> tokens = Arrays.asList(1897, 7763, 9901, 1037);
    
    public void setStatus(int token) {
        if (tokens.contains(token) && status.equals("Pendente")) {
            System.out.println("Pedido validado e pronto para ser processado!");
            this.status = "Processando";
        } else {
            System.out.println("Token inválido ou status já alterado.");
        }
    }


    public void exibirDetalhes(){
        System.out.println("ID do pedido: " + getIdPedido());
        System.out.printf("Valor do pedido: R$ %.2f%n", getValorTotal());
        System.out.println("Data do pedido: " + getDataPedido());
        System.out.println("Cliente: " + getCliente());
        System.out.println("Status do pedido: " + getStatus());
    }

    public void painelDeEscolhas(){
            System.out.println("\n===== OPÇÕES DE VISUALIZAÇÃO =====");
            System.out.println("[1] Visualizar status");
            System.out.println("[2] Visualizar valor");
            System.out.println("[3] Visualizar data");
            System.out.println("[4] Visualizar cliente");
            System.out.println("[5] Exibir todos os detalhes do pedido");
            System.out.println("[6] Validar token de processamento");
            System.out.println("[7] Sair do sistema");
    }
}
