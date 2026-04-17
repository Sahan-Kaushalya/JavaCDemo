package day12.diamond_problem;

public interface A {
    default void show(){
        System.out.println("Default method from A");
    }

    void disply();
}
