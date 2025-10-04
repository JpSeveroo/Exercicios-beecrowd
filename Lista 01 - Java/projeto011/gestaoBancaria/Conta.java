package gestaoBancaria;

public class Conta {
    private String numero, titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String newNumero) {
        this.numero = newNumero;
    }

    public void setTitular(String newTitular) {
        this.titular = newTitular;
    }

    public void setSaldo(double newSaldo) {
        this.saldo = newSaldo;
    }

    public void mostrarDados() {
        System.out.println("\n--- DADOS DA CONTA ---");
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$ " + String.format("%.2f", getSaldo()));
    }

    public void mostrarDados(double taxaProjecaoPercentual) {
        mostrarDados();
        double projecao = getSaldo() * (1 + taxaProjecaoPercentual / 100);
        System.out.println("Saldo com projeção de " + taxaProjecaoPercentual + "%: R$ " + String.format("%.2f", projecao));
    }
}