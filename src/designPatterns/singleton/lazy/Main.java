package designPatterns.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        SingletonLazy instantaSingletonLazy = SingletonLazy.getInstanta(); // abia acum se initializeaza instanta deoarece pana acum era null
                                                                           // vezi si SingletonEager daca nu il stii

        // dupa ce am accesat instanta putem face operatii pe obiect ca si cum am face cu o clasa normala
        // ex: folosirea metodelor, setteri, getteri etc.

        instantaSingletonLazy.setAtribut1(100);
        instantaSingletonLazy.setAtribut2("Hello, World!");
        instantaSingletonLazy.afisare();
    }
}
