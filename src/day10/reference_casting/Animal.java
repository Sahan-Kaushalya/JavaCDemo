package day10.reference_casting;

public class Animal implements Mammal{
    @Override
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
