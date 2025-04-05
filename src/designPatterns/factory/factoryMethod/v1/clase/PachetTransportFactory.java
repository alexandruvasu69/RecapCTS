package designPatterns.factory.factoryMethod.v1.clase;

public class PachetTransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetTransport();
    }
}
