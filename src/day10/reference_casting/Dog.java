package day10.reference_casting;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {

        this.name = name;
    }

    public void makeSound() {

        System.out.println("Woof!");
    }

    public void eat() {

        System.out.println(name + " is eating.");
    }

    public String getName() {

        return name;
    }
}