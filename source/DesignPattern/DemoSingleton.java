class Singleton {
    private static Singleton uniqueInstance;

    // Make the constructor private such that it cannot be called from outside.
    private Singleton(){}

    public static Singleton getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

public class DemoSingleton {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
    }
}
