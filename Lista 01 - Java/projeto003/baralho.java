package projeto003;
import projeto003.cartas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class baralho {

    public class baralho() { 
        this.cartas = new ArrayList();
        String[] naipe = {"Ouros","Paus", "Espadas", "Copas"};
        String[] valor = {"4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"};
    }

    public void embaralhar() {
        Collections.shuffle(this.carta);
    }
}
