package DesignPatterns.Singleton.ChocolateFactory;

public class ChocolateBoilerSingleton {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSingleton uniqueInstance;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ChocolateBoilerSingleton();
        }
        return uniqueInstance;
    }

    private void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    private void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private void drain() {
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    private boolean isEmpty(){
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
