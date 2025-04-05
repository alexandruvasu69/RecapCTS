package designPatterns.prototype.ex1.clase;

// clasa Masina - NU ASTA E CLASA CARE TREBUIE CLONATA DECI NU SE FACE PROTOTYPE PT EA
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
    } // implementarea metodelor din interfata

    @Override
    public int getAnFabricatie() {
        return this.anFabricatie;
    } // implementarea metodelor din interfata
}
