package day14.innerclass.localinner;

class Outer {
    void display() {
        // Local inner class defined inside display()
        class LocalInner {
            void show() {
                System.out.println("Local Inner Class");
            }
        }
        // Instantiating and using the local inner class
        LocalInner li = new LocalInner();
        li.show();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
// In this example:
// - LocalInner is only accessible inside the display() method.
// - It cannot be used outside display(), ensuring encapsulation.
// - Local inner classes are often used for event handling, callbacks, or helper logic specific to a method.