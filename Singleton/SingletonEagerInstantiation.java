package DesignPatterns.Singleton;

public class SingletonEagerInstantiation {
    public  static SingletonEagerInstantiation singletonEagerInstantiation = new SingletonEagerInstantiation();

    private SingletonEagerInstantiation() {}

    public synchronized static  SingletonEagerInstantiation getInstance() {
        return singletonEagerInstantiation;
    }
}
