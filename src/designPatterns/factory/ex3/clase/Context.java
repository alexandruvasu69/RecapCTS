package designPatterns.factory.ex3.clase;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private List<IPersonaj> personajePeCanvas;

    private static Context instance = null;

    private Context() {
        this.personajePeCanvas = new ArrayList<>();
    }

    public static Context getInstance() {
        if(instance == null) {
            instance = new Context();
        }

        return instance;
    }

    public void addPersonaj(IPersonaj personaj) {
        personajePeCanvas.add(personaj);
    }

    public List<IPersonaj> getPersonajePeCanvas() {
        return this.personajePeCanvas;
    }
}
