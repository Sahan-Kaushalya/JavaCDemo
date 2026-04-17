package day12.diamond_problem;

public interface C extends A{
    @Override
    default void show() {
        System.out.println("Method from C");
    }

}
