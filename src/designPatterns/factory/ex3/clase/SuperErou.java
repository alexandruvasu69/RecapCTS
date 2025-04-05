package designPatterns.factory.ex3.clase;

import java.util.List;

public class SuperErou extends APersonaj{
    public SuperErou(List<String> mesaje, Pozitie pozitie) {
        super(mesaje, pozitie);
    }

    @Override
    public void verificaProximitate() {

    }
}
