package designPatterns.prototype.ex1.clase;

import java.util.HashMap;
import java.util.Map;

// acesta este Prototype Factory
// aici sunt initializate datele predefinite
// Cand vrem sa cream un obiect de tip Sticker nu vom mai folosi constructorul care este consumator
// de resurse, ci vom accesa datele din acest factory pe care vom face clone -> mai eficient
public class StickerPrototypeFactory {
    // Map-ul care tine datele predefinite de noi
    // Datele adaugate aici trebuie sa match-uiasca ce este in constructor la switch-case
    // Umpic mai complicat pentru ca am facut map intr-un map
    private Map<String, Map<Integer, Sticker>> stickere = new HashMap<>();

    // initializarea datelor din map
    public StickerPrototypeFactory() {
        // map-ul contine mai multe mapuri in interior
        // asta este primul map continut adica modelul volswagen
        Map<Integer, Sticker> vwStickers = new HashMap<>();
        vwStickers.put(2005, new Sticker(new Masina("volswagen", 2005)));
        vwStickers.put(2010, new Sticker(new Masina("volswagen", 2010)));

        // asta este al doilea map continut adica modelul bmw
        Map<Integer, Sticker> bmwStickers = new HashMap<>();
        bmwStickers.put(2008, new Sticker(new Masina("bmw", 2008)));
        bmwStickers.put(2012, new Sticker(new Masina("bmw", 2012)));

        // fiecare map continut de map-ul mare are ca si cheie anul de fabricatie ca si cheie
        // si un obiect masina ca valoare

        stickere.put("volswagen", vwStickers);
        stickere.put("bmw", bmwStickers);
    } // acesta este singurul loc din aplicatie unde trebuie apelat constructorul pentru sticker
    // care consuma resurse, de aici mai departe se vor crea prin factory

    // asta e functia care v-a prelua Sticker ul din map in functie de masina pe care
    // o primeste ca parametru si il va clona
    public Sticker createSticker(IMasina masina) {
        // aici m am complicat umpic pt ca am vrut sa fac ca un cache
        // pe scurt mai intai se verifica daca exista sticker ul inregistrat aici in map
        // si daca exista se cloneaza, daca nu se creeaza din nou si se adauga la map
        // dar pt test se poate face simplu cu
        // return stickere.get(masina.getModelMasina()).get(masina.getAnFabricatie()).clone(); (DOAR ATAT DA, RESTUL STERS,
        // DAR ATENTIE CA TOATE DATELE DORITE SA FIE PREDEFINITE IN MAP);

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
