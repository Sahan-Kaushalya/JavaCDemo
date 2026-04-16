package day10.reference_casting;

public class ReferenceTypeCastingDemo {
    public static void main(String[] args) {

        // Upcasting: Subclass reference to superclass reference
        Dog dog = new Dog("Buddy");
        Animal animal = dog; // Upcasting (implicit)
        System.out.println("Upcasting:");
        animal.makeSound(); // Calls Dog's makeSound method
        animal.eat();       // Calls Dog's eat method

        // Downcasting: Superclass reference to subclass reference
        boolean b = animal instanceof Dog; // true, so safe to downcast
        if (animal instanceof Dog) {
            Dog downcastedDog = (Dog) animal; // Downcasting (explicit)
            System.out.println("\nDowncasting:");
            downcastedDog.makeSound(); // Calls Dog's makeSound method
            downcastedDog.eat();       // Calls Dog's eat method
        } else {
            System.out.println("The object is not an instance of Dog.");
        }
        // Attempting invalid downcasting
        try {
            Cat cat = new Cat("Whiskers");
            Animal anotherAnimal = cat; // Upcasting

            Dog anotherDog = (Dog) anotherAnimal; // Invalid downcasting, will throw ClassCastException
        } catch (ClassCastException e) {
            System.err.println("Invalid cast: " + e.getMessage());
            // Handle gracefully, e.g., default object
        }
        // Using instanceof to avoid ClassCastException. java 16+ pattern matching for instanceof
        Object obj = "Hello";
        if (obj instanceof String message) {
            System.out.println(message.length());  // No cast needed
        } else {
            System.out.println("The object is not a String.");
        }

        // Pattern matching in switch (java 17+).
        // Note: this is a preview feature and may require enabling preview features in the compiler.
//        Object obj1 = "Hellol";
//        String result = switch (obj1) {
//            case String s -> "String: " + s.length();  //String s=obj1      s.length()
//            case Integer i -> "Integer: " + i;
//            case null -> "Null value";
//            default -> "Unknown type";
//        };
//        System.out.println(result);
    }

    // Method to demonstrate instanceof with pattern matching
    static void processAnimal(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.makeSound();
        } else if (animal instanceof Cat cat) {
            cat.makeSound();
        } else {
            System.out.println("Unknown animal");
        }
    }

}
