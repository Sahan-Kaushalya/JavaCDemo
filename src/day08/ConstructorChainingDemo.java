package day08;

public class ConstructorChainingDemo {
    private String name;
    private int age;

    // Default constructor
    public ConstructorChainingDemo() {
        // Chaining to the parameterized constructor using 'this'
        this("Kaushalya");
        System.out.println("Default Constructor Called");
    }

    // Parameterized constructor (1 parameter)
    public ConstructorChainingDemo(String name) {
        // Chaining to the parameterized constructor (2 parameters)
        this(name, 18);
        System.out.println("Constructor with Name Called");
    }

    // Parameterized constructor (2 parameters)
    public ConstructorChainingDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Main Parameterized Constructor Called (Name: " + name + ", Age: " + age + ")");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("\n--- Creating object with default constructor ---");
        ConstructorChainingDemo obj1 = new ConstructorChainingDemo();
        obj1.display();

        System.out.println("\n--- Creating object with name constructor ---");
        ConstructorChainingDemo obj2 = new ConstructorChainingDemo("Weerathunga",20);
        obj2.display();
    }

}
