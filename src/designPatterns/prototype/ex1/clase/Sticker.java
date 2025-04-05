package designPatterns.prototype.ex1.clase;

import java.util.Map;

public class Sticker implements ISticker {
    private Map<String, Double> dimensiuni;

    private Sticker() {
        this.dimensiuni = null;
    }

    public Sticker(IMasina masina) {
        System.out.println("Preluare date de la producator despre " + masina.getModelMasina() + " din anul " + masina.getAnFabricatie());

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

    private Map<String, Double> preiaDimensiuniDeLaProducator(double lungime, double latime) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return Map.of("lungime", lungime, "latime", latime);
    }

    @Override
    public ISticker copiaza() {
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
