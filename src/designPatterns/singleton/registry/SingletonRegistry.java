package designPatterns.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private final int id;
    private int atribut1;
    private String atribut2;

    public SingletonRegistry setAtribut1(int atribut1) {
        this.atribut1 = atribut1;
        return this;
    }

    public SingletonRegistry setAtribut2(String atribut2) {
        this.atribut2 = atribut2;
        return this;
    }

    public void afisare() {
        System.out.println(id + ". " + atribut1 + " " + atribut2);
    }

    private static Map<Integer, SingletonRegistry> registry = new HashMap<>();

    static {
        registry.put(1, new SingletonRegistry(1, 100, "Salut"));
        registry.put(2, new SingletonRegistry(1, 100, "Salut"));
        registry.put(3, new SingletonRegistry(1, 100, "Salut"));
    }

    private SingletonRegistry(int id, int atribut1, String atribut2) {
        this.id = id;
        this.atribut1 = atribut1;
        this.atribut2 = atribut2;
    }

    public static SingletonRegistry getInstance(int id) {
        SingletonRegistry instance = registry.computeIfAbsent(id, i -> new SingletonRegistry(i, 0, "Salut233"));

        return instance;
    }

}
