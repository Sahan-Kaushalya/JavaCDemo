package day10;

public class PrimitiveCastingDemo {

    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt = 100;
        double myDouble = myInt; // int is automatically converted to double
        System.out.println("Implicit Casting (Widening):");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        // Explicit Casting (Narrowing)
        double anotherDouble = 9.99;
        int anotherInt = (int) anotherDouble; // double is explicitly cast to int
        System.out.println("\nExplicit Casting (Narrowing):");
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Integer value: " + anotherInt);

        // Potential data loss in explicit casting
        double largeDouble = 123456.789;
        int largeInt = (int) largeDouble; // This will cause data loss
        System.out.println("\nData Loss in Explicit Casting:");
        System.out.println("Large Double value: " + largeDouble);
        System.out.println("Large Integer value: " + largeInt);
    }
}
