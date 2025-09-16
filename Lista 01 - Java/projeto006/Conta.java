public class Conta {
    private String titular, numeroConta;
    private double saldo;

    public Conta(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNome(String newTitular){
        this.titular = newTitular;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Transação de saque concluida R$" + valor + " sacados");
        }else{
            System.out.println("Transação interrompida. Valor de saque inválido, tente novamente mais tarde.");
        }
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor de depósito inválido, tente novamente mais tarde.");
        }else{
            saldo += valor;
            System.out.println("Depósito no valor de R$"+ valor + " efetuado em nome do Sr(a) " + titular);
        }
    }
}
