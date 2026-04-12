package day06.classTypesDemo;

public interface Vehicle {
    int MAX_SPEED = 120;
    void start();
    default void honk(){System.out.println("Honking....");}
    static  void info(){
        System.out.println("Vehicle Info - Interface");
    }
}
