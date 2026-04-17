package day13.seale_permit;

// Sealed class: Only permitted subclasses can extend it
sealed class Shape permits Circle, Rectangle, Triangle {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

final class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

final class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

//non-sealed class: Can be extended by any class, but it cannot extend a sealed class
non-sealed class Triangle extends Shape { 
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw(); // Output: Drawing a circle
        s2.draw(); // Output: Drawing a rectangle

    }
}