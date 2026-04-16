package day11.abstraction;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" says: Meow! Meow!");
    }
}
