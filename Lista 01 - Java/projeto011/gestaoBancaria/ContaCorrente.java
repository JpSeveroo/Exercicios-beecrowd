package gestaoBancaria;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial) {
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double newLME) {
        this.limiteChequeEspecial = newLME;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite do cheque especial: R$ " + String.format("%.2f", getLimiteChequeEspecial()));
    }

    public void mostrarDados(boolean detalharLimite) {
        this.mostrarDados(); 
        if (detalharLimite) {
            double saldoDisponivel = getSaldo() + getLimiteChequeEspecial();
            System.out.println("Saldo Disponível (Saldo + Limite): R$ " + String.format("%.2f", saldoDisponivel));
        }
    }
}