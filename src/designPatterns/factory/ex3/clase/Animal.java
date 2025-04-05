package designPatterns.factory.ex3.clase;

import java.util.List;

public class Animal extends APersonaj{
    public Animal(List<String> mesaje, Pozitie pozitie) {
        super(mesaje, pozitie);
    }

    @Override
    public void verificaProximitate() {

    }
}
