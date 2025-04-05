package designPatterns.factory.factoryMethod.v1.clase;

public class PachetCazareFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetCazare();
    }
}
