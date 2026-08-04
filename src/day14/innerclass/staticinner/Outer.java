package day14.innerclass.staticinner;

public class Outer {
    int outerField = 10; // Example non-static field (not accessible from static inner class)
    static int staticOuterField = 20; // Example static field (accessible from static inner class)


    // Static inner class
    static class Inner {
        void display() {
            // Can access static members of Outer directly (none in this example)
            System.out.println("Static outer field: " + staticOuterField);
           // System.out.println("Cannot access non-static outer field: " + outerField ); // This will cause a compile-time error
            System.out.println("Inside static inner class");
            System.out.println("Static inner class can be instantiated without Outer object");
        }
    }

    public static void main(String[] args) {
        // Creating instance of static inner class without Outer object
        Outer.Inner innerObj = new Outer.Inner();
        innerObj.display();
    }
}