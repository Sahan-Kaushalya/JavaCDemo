package day11.abstraction;

public class Human extends Animal{
    public Human(String name) {
        super(name);
    }
    @Override
    public void sleep() {
        super.sleep();
    }
    @Override
    public void makeSound() {
        System.out.println(getName()+" says: Hello! Hello!");
    }
}
