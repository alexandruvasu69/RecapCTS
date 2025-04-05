package designPatterns.prototype.ex1.clase;

public class Masina implements IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModelMasina() {
        return this.model;
    }

    @Override
    public int getAnFabricatie() {
        return this.anFabricatie;
    }
}
