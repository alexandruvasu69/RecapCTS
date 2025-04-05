package designPatterns.factory.ex3.clase;

import java.util.List;

public class Vrajitor extends APersonaj {
    public Vrajitor(List<String> mesaje, Pozitie pozitie) {
        super(mesaje, pozitie);
    }

    @Override
    public void verificaProximitate() {
        Context context = Context.getInstance();

        List<IPersonaj> personajeInProximitate = context.getPersonajePeCanvas().stream().filter((p) -> this.pozitie.isInProximityToOtherPosition(p.getPozitie(), 5) && p != this).toList();

        for(IPersonaj p : personajeInProximitate) {
            System.out.println("Personajul de la pozitia " + this.pozitie + " se afla in proximitatea personajului de la pozitia " + p.getPozitie());
            super.mesaje.add(p.spuneCeva());
        }
    }

}
