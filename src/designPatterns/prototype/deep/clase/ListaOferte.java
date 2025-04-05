package designPatterns.prototype.deep.clase;

import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte{
    private List<String> oferte = new ArrayList<>();

    @Override
    public IListaOferte copy() {
        ListaOferte copie = new ListaOferte();
        List<String> copieLista = new ArrayList<>();
        for(String s : this.oferte) {
            copieLista.add(s);
        }

        copie.oferte = copieLista;

        return copie;
    }

    @Override
    public void incarcaListaOferte() {
        // proces consumator de resurse

        oferte.addAll(List.of("Grecia", "Turcia", "Egipt", "Maroc", "Spania", "Italia"));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaOferte{");
        sb.append("oferte=").append(oferte);
        sb.append('}');
        return sb.toString();
    }
}
