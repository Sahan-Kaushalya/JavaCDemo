package day10.reference_casting;

public class Cat extends Animal {
    private String name;

    public Cat(String name) {

        this.name = name;
    }

    public void makeSound() {

        System.out.println("Meow!");
    }

    public void eat() {

        System.out.println(name + " is eating.");
    }

    public String getName() {

        return name;
    }
}