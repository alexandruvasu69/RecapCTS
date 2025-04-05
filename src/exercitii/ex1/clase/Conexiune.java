package exercitii.ex1.clase;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Conexiune {
    // colectie in context singleton registry
    private static Map<String, Conexiune> mapa = new HashMap<>();

    // Singleton-Data
    private String data;
    private int nrAccesari;

    private Conexiune(String data) {
        this.data = data;
        this.nrAccesari = 0;
    }

    public static Conexiune getInstance(Client client) {
        if(!mapa.containsKey(client.getNume())) {
            mapa.put(client.getNume(), new Conexiune(new Date().toString()));
        }

        mapa.get(client.getNume()).nrAccesari++;
        return mapa.get(client.getNume());
    }

}
