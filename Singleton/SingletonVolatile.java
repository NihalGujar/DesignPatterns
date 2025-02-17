package DesignPatterns.Singleton;

public class SingletonVolatile {
    private static  volatile SingletonVolatile singletonVolatile;

    private SingletonVolatile() {}

    public static SingletonVolatile getInstance(){
        if(singletonVolatile == null)
        {
            synchronized (SingletonVolatile.class) {
                if (singletonVolatile == null)
                {
                    singletonVolatile = new SingletonVolatile();
                }
            }
        }
        return singletonVolatile;
    }
}
