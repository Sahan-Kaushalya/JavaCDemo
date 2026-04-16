package day11.covariant_return_type_demo;

public class Car extends Vehicle {

    @Override
    public Lion park() {
        System.out.println("Car is parked. Returning a Lion.");
        return new Lion();
    }
}