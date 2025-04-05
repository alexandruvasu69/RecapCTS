package designPatterns.factory.simpleFactory.v1.program;

import designPatterns.factory.simpleFactory.v1.clase.PachetTuristic;
import designPatterns.factory.simpleFactory.v1.clase.PachetTuristicFactory;
import designPatterns.factory.simpleFactory.v1.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory pachetTuristicFactory = new PachetTuristicFactory();
        PachetTuristic pachetCazare = pachetTuristicFactory.createPachet(TipPachet.PACHET_CAZARE);

        pachetCazare.afiseazaDescriere();

        PachetTuristic pachetTransport = pachetTuristicFactory.createPachet(TipPachet.PACHET_TRANSPORT);
        pachetTransport.afiseazaDescriere();
    }
}
