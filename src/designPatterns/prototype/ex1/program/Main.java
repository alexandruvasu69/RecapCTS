package designPatterns.prototype.ex1.program;

import designPatterns.prototype.ex1.clase.IMasina;
import designPatterns.prototype.ex1.clase.Masina;
import designPatterns.prototype.ex1.clase.Sticker;
import designPatterns.prototype.ex1.clase.StickerPrototypeFactory;

public class Main {
    public static void main(String[] args) {
        StickerPrototypeFactory spf = new StickerPrototypeFactory();

        IMasina masina1 = new Masina("volswagen", 2005);
        IMasina masina2 = new Masina("bmw", 2012);
        IMasina masina3 = new Masina("dacia", 2018);
        IMasina masina4 = new Masina("dacia", 2018);

        Sticker sticker1 = spf.createSticker(masina1);
        System.out.println(sticker1);
        Sticker sticker2 = spf.createSticker(masina2);
        System.out.println(sticker2);
        Sticker sticker3 = spf.createSticker(masina3);
        System.out.println(sticker3);
        Sticker sticker4 = spf.createSticker(masina4);
        System.out.println(sticker4);
    }
}
