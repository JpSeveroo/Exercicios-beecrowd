package projeto003;

public class cartas {
    private String naipe;
    private String valor;

    public cartas (String valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    public String getValor(){
        return valor;
    }

    public String getNaipe(){
        return naipe;
    }

    @Override
    public String toString(){
        return this.valor + " de " + this.naipe;
    }
}
