package day13.SOLID.Interface_Segregation;

public class HumanWorker implements worker, eatable, sleepable {


    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}