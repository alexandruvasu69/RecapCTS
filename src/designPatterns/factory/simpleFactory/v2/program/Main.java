package designPatterns.factory.simpleFactory.v2.program;

import designPatterns.factory.simpleFactory.v2.clase.PachetFactorySingleton;
import designPatterns.factory.simpleFactory.v2.clase.PachetTuristic;
import designPatterns.factory.simpleFactory.v2.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        PachetFactorySingleton pachetFactorySingleton = PachetFactorySingleton.getInstance();
        PachetTuristic pachetCazare = pachetFactorySingleton.createPachet(TipPachet.PACHET_CAZARE);
        PachetTuristic pachetTransport = pachetFactorySingleton.createPachet(TipPachet.PACHET_TRANSPORT);

        pachetCazare.afiseazaDescriere();
        pachetTransport.afiseazaDescriere();

    }

}
