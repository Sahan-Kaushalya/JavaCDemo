package day11.covariant_return_type_demo;

public class Vehicle {

    public Animal park(){
        System.out.println("Vehicle is parked. Returning an Animal.");
        return new Animal();
    }
}