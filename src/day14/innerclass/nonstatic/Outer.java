package day14.innerclass.nonstatic;

public class Outer {

    private String outerField = "Outer Field";

    // Non-static inner class
    class Inner {
        private String innerField = "Inner Field";
        public void display() {
            // Accessing outer class's private member
            System.out.println("Accessing: " + outerField);
        }

    }

    public void createInnerInstance() {
        Inner inner = new Inner();
        inner.display();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();

        System.out.println(outer.outerField);
        System.out.println(outer.new Inner().innerField);

        outer.createInnerInstance();

        Outer.Inner innerInstance = outer.new Inner();
        innerInstance.display();

        //Inner anotherInner = new Inner(); // This line would cause a compile-time error.
        //  because it is trying to create an instance of the inner class without referencing an instance of the outer class.
    }
}