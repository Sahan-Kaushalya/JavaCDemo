package day10;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper class
        int primitiveInt = 25;
        Integer boxedInt = primitiveInt; // Automatic conversion

        // Unboxing: Wrapper class to Primitive
        Integer anotherBoxedInt = 50;
        int unboxedInt = anotherBoxedInt; // Automatic conversion

        System.out.println("Autoboxing and Unboxing Demo:");
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        // Autoboxing in expressions
        Integer count = 10;
        count++; // Unboxed, incremented, then re-boxed
        System.out.println("Incremented Boxed Integer: " + count);

        // Autoboxing with Double
        Double price = 19.99; // Autoboxing
        double primitivePrice = price; // Unboxing
        System.out.println("Double Wrapper: " + price);
        System.out.println("double primitive: " + primitivePrice);

        Integer boxedInt3 = 10; // Autoboxing

        int i = 20;
        Integer boxedInt2 = i; // Autoboxing

        double primitiveDouble = 15.5; // primitive
        Double boxedDouble2 = primitiveDouble; // Autoboxing

        // --- Auto-unboxing examples ---

        // Simple auto-unboxing: wrapper -> primitive
        Integer boxed = Integer.valueOf(42); // creates an Integer object
        int unboxed = boxed; // auto-unboxing from Integer to int
        System.out.println("boxed -> unboxed: " + unboxed);

        // Unboxing in arithmetic expressions: wrapper values are unboxed automatically
        Integer a = 5;
        Integer b = 10;
        int sum = a + b; // both a and b are unboxed to int, then added
        System.out.println("sum (a + b): " + sum);

        // Unboxing from collections: collections hold wrapper objects, retrieving gives wrapper
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(100); // autoboxing of int 100 to Integer
        int fromList = list.get(0); // auto-unboxing from Integer to int
        System.out.println("fromList: " + fromList);
    }

}
