package designPatterns.factory.ex3.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class APersonaj implements IPersonaj{
    protected List<String> mesaje;
    protected Pozitie pozitie;

    public APersonaj(List<String> mesaje, Pozitie pozitie) {
        this.mesaje = new ArrayList<>(mesaje);
        this.pozitie = pozitie;
    }

    @Override
    public String spuneCeva() {
        if(!this.mesaje.isEmpty()) {
            return this.mesaje.get(new Random().nextInt(this.mesaje.size()));
        }

        return "Nu exista mesaje!";
    }

    @Override
    public Pozitie getPozitie() {
        return pozitie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("APersonaj{");
        sb.append("mesaje=").append(mesaje);
        sb.append(", pozitie=").append(pozitie);
        sb.append('}');
        return sb.toString();
    }
}
