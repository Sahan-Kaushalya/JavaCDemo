package day11.abstraction;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" says: Woof! Woof!");
    }
}
