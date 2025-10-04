package gestaoBancaria;

public class ContaInvestimento extends Conta {
    private double taxaAdministracao;

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao) {
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double newTaxaAdmin) {
        this.taxaAdministracao = newTaxaAdmin;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de administração: " + getTaxaAdministracao() + "%");
    }

    public void mostrarDados(boolean considerarTaxa) {
        this.mostrarDados(); 
        
        if (considerarTaxa) {
            double saldoProjetado = getSaldo() * 1.05; 
            double valorTaxa = saldoProjetado * (taxaAdministracao / 100);
            double saldoLiquido = saldoProjetado - valorTaxa;
            System.out.println("Saldo líquido projetado (após rendimento e taxa): R$ " + String.format("%.2f", saldoLiquido));
        }
    }
}