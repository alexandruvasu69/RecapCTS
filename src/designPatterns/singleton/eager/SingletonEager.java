package designPatterns.singleton.eager;

// Singleton eager se foloseste atunci cand se cere ca instanta obiectului
// dorit sa fie creata de la bun inceput, indiferent daca se acceseaza instanta
// aceea sau nu.

public class SingletonEager {
    // singleton data -> astea sunt atributele specifice clasei(adica chiar daca nu era singleton tot aveai astea in clasa normala)
    // chiar daca se numeste "singleton" data nu are legatura prea mare cu codul pentru singleton
    // ex: atribute precum varsta, nume, orice ai tine si intr o clasa normala
    private int atribut1;
    private String atribut2;

    // pt atributele astea se pot creea metode in mod normal cum s ar creea pentru o clasa normala

    public void afisare() {
        System.out.println(atribut1 + " " + atribut2);
    }

    // Specific singleton acum

    //   instanta singleton -> instanta UNICA pentru clasa noastra
    //   definita ca STATIC pentru a fi accesata fara a fi nevoie sa cream un obiect din clasa
    //   dar definita ca PRIVATE pentru a nu o accesa direct pe ea ci prin metoda getInstance()
    //   si FINAL, optional pentru a nu putea modifica instanta
    //   dar daca nu avem metode care modifica instanta precum un setter static nu ne trebuie neaparat

    private static final SingletonEager instanta = new SingletonEager(); // apelarea constructorului aici pentru EAGER

    // Constructorul NEAPARAT PRIVAT pentru a nu putea fi accesat din afara, accesarea se face doar prin instanta
    private SingletonEager() {
        this.atribut1 = 0; // la singleton eager trebuie date niste valori default intrucat se initializeaza
                           // inainte sa avem acces la ele
        this.atribut2 = "";
    }

    // metoda getInstance care este publica pentru a putea fi accesata din afara
    // si statica pentru a putea fi accesata direct fara a fi nevoie sa cream un obiect
    // acesta este singurul mod prin care se acceseaza instanta unica a clasei din main

    public static SingletonEager getInstanta() {
        return instanta;
    }

}
