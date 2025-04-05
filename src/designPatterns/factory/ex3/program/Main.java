package designPatterns.factory.ex3.program;

import designPatterns.factory.ex3.clase.*;

public class Main {
    public static void main(String[] args) {
        Context canvas = Context.getInstance();

        PersonajeFactory personajeFactory = new PersonajeFactory();
        APersonaj animal = personajeFactory.createPersonaj(TipPersonaj.ANIMAL, new Pozitie(2, -4));
        APersonaj vrajitor = personajeFactory.createPersonaj(TipPersonaj.VRAJITOR, new Pozitie(0, 0));
        APersonaj superErou = personajeFactory.createPersonaj(TipPersonaj.SUPER_EROU, new Pozitie(10, -5));

        canvas.addPersonaj(animal);
        canvas.addPersonaj(vrajitor);
        canvas.addPersonaj(superErou);

        vrajitor.verificaProximitate();
        animal.verificaProximitate();
        superErou.verificaProximitate();

        System.out.println(vrajitor);
        System.out.println(animal);
        System.out.println(superErou);
    }
}
