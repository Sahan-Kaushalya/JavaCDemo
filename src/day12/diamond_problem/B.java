package day12.diamond_problem;

public interface B extends A{

    @Override
    default void show() {
        System.out.println("Method from B");
    }

}
