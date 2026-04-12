package day06.classTypesDemo;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("......Car started ......");
    }

    @Override
    public void honk() {
        System.out.println("Car Honking ......");
    }


}
