package DesignPatterns.Singleton;

public class MyClass {
    private MyClass () {}

    public static void main(String[] args) {
        MyClass myClass = new MyClass(); // As per Singleton, Object should not be created more than once, even if it's in the same class
        MyClass myClass1 = new MyClass();
    }
}
