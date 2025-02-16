package DesignPatterns.Singleton;

public class Singleton {
    private static Singleton uniqueInstance; // static variable to hold our one instance of the class Singleton

    private Singleton() {} // constructor

    public static Singleton getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Singleton();
        }
        return  uniqueInstance;
    }
}
