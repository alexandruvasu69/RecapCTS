package designPatterns.prototype.ex1.clase;

import java.util.HashMap;
import java.util.Map;

public class StickerPrototypeFactory {
    private Map<String, Map<Integer, Sticker>> stickere = new HashMap<>();

    public StickerPrototypeFactory() {
        Map<Integer, Sticker> vwStickers = new HashMap<>();
        vwStickers.put(2005, new Sticker(new Masina("volswagen", 2005)));
        vwStickers.put(2010, new Sticker(new Masina("volswagen", 2010)));

        Map<Integer, Sticker> bmwStickers = new HashMap<>();
        bmwStickers.put(2008, new Sticker(new Masina("bmw", 2008)));
        bmwStickers.put(2012, new Sticker(new Masina("bmw", 2012)));

        stickere.put("volswagen", vwStickers);
        stickere.put("bmw", bmwStickers);
    }

    public Sticker createSticker(IMasina masina) {
        Sticker sticker;

        Map<Integer, Sticker> aniFabricatiePentruModel = stickere.get(masina.getModelMasina());

        if (aniFabricatiePentruModel != null) {
            sticker = aniFabricatiePentruModel.get(masina.getAnFabricatie());

            if (sticker != null) {
                return (Sticker) sticker.copiaza();
            } else {
                sticker = new Sticker(masina);
                aniFabricatiePentruModel.put(masina.getAnFabricatie(), sticker);
                return sticker;
            }
        } else {
            // Primul sticker pentru acest model
            sticker = new Sticker(masina);
            Map<Integer, Sticker> newMap = new HashMap<>();
            newMap.put(masina.getAnFabricatie(), sticker);
            stickere.put(masina.getModelMasina(), newMap);
            return sticker;
        }
    }
}
