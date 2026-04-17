package day13.SOLID.Interface_Segregation;

public class RobotWorker implements worker{

    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}