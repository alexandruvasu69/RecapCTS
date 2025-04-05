package designPatterns.factory.factoryMethod.v1.program;

import designPatterns.factory.factoryMethod.v1.clase.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory pachetCazareFactory = new PachetCazareFactory();
        PachetTuristicFactory pachetTransportFactory = new PachetTransportFactory();

        PachetTuristic pachetCazare = pachetCazareFactory.createPachet();
        PachetTuristic pachetTransport = pachetTransportFactory.createPachet();

        pachetCazare.afiseazaDescriere();
        pachetTransport.afiseazaDescriere();
    }
}
