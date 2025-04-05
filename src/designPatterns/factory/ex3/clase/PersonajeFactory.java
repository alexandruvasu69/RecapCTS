package designPatterns.factory.ex3.clase;

import java.util.List;

public class PersonajeFactory {
    public APersonaj createPersonaj(TipPersonaj tipPersonaj, Pozitie pozitie) {
        switch (tipPersonaj) {
            case ANIMAL:
                return new Animal(List.of("Animal Sound 1", "Animal Sound 2"), pozitie);
            case VRAJITOR:
                return new Vrajitor(List.of("Vrajitor Sound 1", "Vrajitor Sound 2", "Vrajitor Sound 3"), pozitie);
            case SUPER_EROU:
                return new SuperErou(List.of("Super-Erou Sound 1", "Super-Erou Sound 2"), pozitie);
            default:
                return null;
        }
    }
}
