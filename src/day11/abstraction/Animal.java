package day11.abstraction;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    // Abstract method that must be implemented by subclasses
    // An abstract method cannot be created inside a non-abstract class
    public abstract void makeSound();

    public static void main(String[] args) {
        Animal dog = new Dog("Rexy");
        dog.makeSound();
        dog.sleep();

        Animal man = new Human("Kavindu");
        man.sleep();
        man.makeSound();
    }
}