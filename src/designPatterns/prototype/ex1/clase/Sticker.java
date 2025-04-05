package designPatterns.prototype.ex1.clase;

import java.util.Map;

// aceasta este clasa pentru care procesul de creeare consuma resurse -> se face PROTOTYPE
// trebuie implementata interfata ISticker care contine metoda de clone pentru prototype
public class Sticker implements ISticker {
    private Map<String, Double> dimensiuni; // am vrut sa tin dimensiunile intr un map ca sa fie mai usor de accesat

    // acesta este un constructor privat apelat doar in interiorul acestei clase si este folosit
    // in metoda implementarea metodei clone deoarece vrem sa creeam un nou obiect Sticker gol
    private Sticker() {
        this.dimensiuni = null;
    }

    // IMPORTANT! Acesta este constructorul consumator de resurse, care in teorie ar trebui sa acceseze niste date externe
    // prin apeluri la baza de date sau ceva asemanator. Noi nu avem insa acces la date externe, si pentru simplitate
    // trebuie simulat acest proces prin acel switch case.
    public Sticker(IMasina masina) {
        System.out.println("Preluare date de la producator despre " + masina.getModelMasina() + " din anul " + masina.getAnFabricatie());

        // Aici se poate adauga si un Thread.sleep(1000) pentru a demonstra in main faptul ca este consumator de resurse sau ca dureaza mult

        // simularea unui raspuns de la baza de date
        // ne creem noi valorile pe care le dorim
        switch (masina.getModelMasina().toLowerCase()) {
            case "volswagen":
                switch (masina.getAnFabricatie()) {
                    case 2005:
                        this.dimensiuni = preiaDimensiuniDeLaProducator(4.5, 2.3);
                    case 2010:
                        this.dimensiuni = preiaDimensiuniDeLaProducator(5, 2.5);
                }
            case "bmw":
                switch (masina.getAnFabricatie()) {
                    case 2008:
                        this.dimensiuni = preiaDimensiuniDeLaProducator(5.3, 2.8);
                    case 2012:
                        this.dimensiuni = preiaDimensiuniDeLaProducator(4.8, 2.5);
                }
            case "dacia":
                switch (masina.getAnFabricatie()) {
                    case 2018:
                        this.dimensiuni = preiaDimensiuniDeLaProducator(3.9, 2.3);
                    case 2022:
                        this.dimensiuni = preiaDimensiuniDeLaProducator(4.1, 2.4);
                }
        }
    }

    // functie private ajutatoare pentru a nu repeta codul in constructor
    private Map<String, Double> preiaDimensiuniDeLaProducator(double lungime, double latime) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return Map.of("lungime", lungime, "latime", latime);
    }

    // implementarea metodei clone
    @Override
    public ISticker copiaza() {
        // este creeat un nou sticker gol -> NEAPARAT FOLOSIT CONSTRUCTORUL FARA PARAMETRII SAU (Sticker) super.clone()
        // PENTRU A NU SE FACE IAR FUNCTIA CONSUMATOARE DE RESURSE
        // daca se foloseste super.clone() trebuie ca ISticker sa extinda interfata Clonable
        Sticker copieSticker = new Sticker();
        copieSticker.dimensiuni = this.dimensiuni;

        return copieSticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("dimensiuni=").append(dimensiuni);
        sb.append('}');
        return sb.toString();
    }
}
