package designPatterns.singleton.lazy;

// Singleton Lazy se foloseste atunci cand se cere ca instanta obiectului
// dorit sa NU fie creata de la bun inceput, ci doar atunci cand se doreste
// accesarea ei prin metoda getInstance() pentru prima oara;

public class SingletonLazy {
    // singleton data -> vezi SingletonEager pt explicatie
    private int atribut1;
    private String atribut2;

    // metodele specifice clasei -> la fel vezi SingletonEager pt explicatie
    public void afisare() {
        System.out.println(atribut1 + " " + atribut2);
    }

    public SingletonLazy setAtribut1(int atribut1) {
        this.atribut1 = atribut1;
        return this;
    }

    public SingletonLazy setAtribut2(String atribut2) {
        this.atribut2 = atribut2;
        return this;
    }

    // singleton instance - este la fel ca la eager, singura diferenta este ca se initializeaza cu null, si
    // OBLIGATORIU fara FINAL
    // -> vezi SingletonEager pt explicatia completa pt instance
    private static SingletonLazy instance = null;

    // constructorul PRIVAT -> vezi SingletonEager pt explicatie
    private SingletonLazy() {
        this.atribut1 = 0;
        this.atribut2 = "";
    }

    // getInstanta() -> AICI ESTE DIFERENTA INTRE EAGER SI LAZY
    public static SingletonLazy getInstanta() {
        // cand este accesat prima data prin getInstanta valoarea instantei este null deci trebuie initializata.
        // daca instanta nu este null (adica a fost initializata deja) nu se mai intra in if si doar se da return la instanta
        if(instance == null) {
            instance = new SingletonLazy(); // se apeleaza constructorul privat
        }

        return instance;
    }
}
