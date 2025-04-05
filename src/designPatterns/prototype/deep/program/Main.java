package designPatterns.prototype.deep.program;

import designPatterns.prototype.deep.clase.IListaOferte;
import designPatterns.prototype.deep.clase.ListaOferte;

public class Main {
    public static void main(String[] args) {
        IListaOferte listaOferte = new ListaOferte();
        listaOferte.incarcaListaOferte();

        IListaOferte copieListaOferte = listaOferte.copy();

        System.out.println(copieListaOferte);
    }
}
