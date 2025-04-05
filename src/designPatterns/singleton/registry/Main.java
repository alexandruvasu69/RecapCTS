package designPatterns.singleton.registry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry.getInstance(1).afisare();
        SingletonRegistry.getInstance(2).afisare();
        SingletonRegistry.getInstance(3).afisare();
        SingletonRegistry.getInstance(4).afisare();
    }
}
