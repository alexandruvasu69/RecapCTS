package designPatterns.factory.simpleFactory.v1.clase;

public class PachetTuristicFactory {
    public PachetTuristic createPachet(TipPachet tipPachet) {
        switch (tipPachet) {
            case PACHET_CAZARE:
                return new PachetCazare();
            case PACHET_TRANSPORT:
                return new PachetTransport();
            default:
                return null;
        }
    }
}
