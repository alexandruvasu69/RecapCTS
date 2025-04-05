package designPatterns.factory.simpleFactory.v2.clase;

public class PachetFactorySingleton {
    private static final PachetFactorySingleton instance = new PachetFactorySingleton();

    private PachetFactorySingleton() {}

    public static PachetFactorySingleton getInstance() {
        return instance;
    }
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
