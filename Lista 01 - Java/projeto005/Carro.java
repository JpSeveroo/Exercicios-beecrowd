package projeto005;

public class Carro {
    private String marca, modelo;
    private int ano, velocidadeAtual;

    public Carro(String marca, String modelo, int ano, int velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int valor){
        if (this.velocidadeAtual <= 200 && valor > 0){
                this.velocidadeAtual += valor;
                System.out.println("Sua velocidade acaba de ser aumentada.");
        }else if (this.velocidadeAtual > 200){
            System.out.println("Devagar ae irmão, para sua segurança o carro não pode ultrapassar 200 km/h");
        }else{
            System.out.println("Valor de aceleração inválido.");
        }
    }

    public void frear(int valor){
        if (valor > 0 && valor <= this.velocidadeAtual){
            this.velocidadeAtual -= valor;
            System.out.println("Sua velocidade acaba de ser reduzida.");
        }else{
             System.out.println("Valor de frenagem inválido.");
        }
    }

    public void exibirStatus(){
        System.out.println("===== STATUS DO CARRO =====");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca:" + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);
    }
}
