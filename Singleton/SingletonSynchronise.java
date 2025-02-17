package DesignPatterns.Singleton;

public class SingletonSynchronise {
    private static SingletonSynchronise uniqueInstance;

    private SingletonSynchronise() {}

    public static synchronized SingletonSynchronise getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronise();
        }
        return uniqueInstance;
    }
}
