package day13.SingletonDP;

public class Singleton {

    public static Singleton singleton;

    private Singleton() { //because of private constructor, no one can create an instance of this class from outside
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}