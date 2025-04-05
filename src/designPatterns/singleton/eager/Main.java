package designPatterns.singleton.eager;

public class Main {
    public static void main(String[] args) {
        // se acceseaza prin getInstanta() nu prin new SingletonEager();
        // se poate accesa de oriunde nu neaparat din main si datele vor fi aceleasi
        // -> asta e important la singleton si de obicei e accesat din mai multe clase
        SingletonEager instantaSingletonEager = SingletonEager.getInstanta();

        // dupa accesarea cu getInstanta() se poate lucra ca si cu o clasa normala
        // folosire de metode, setteri daca avem etc.
        instantaSingletonEager.afisare();
    }
}
