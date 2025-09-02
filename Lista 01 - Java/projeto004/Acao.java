package projeto004;

public class Acao {
    private String nome;
    private int numeroConta;
    private double saldo;

    public Acao(String nome, int numeroConta, double saldoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void exibirSaldo(){
        System.out.printf("\nO seu saldo atual é R$ %.2f\n", this.saldo);
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Erro: Valor de depósito inválido.");
        }
    }

}
