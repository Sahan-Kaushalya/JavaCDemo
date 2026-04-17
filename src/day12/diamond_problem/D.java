package day12.diamond_problem;

public class D implements B,C{
//    @Override
//    public void show() {
//        super.show();
//    }

    @Override
    public void show() {
        B.super.show();
    }

    @Override
    public void disply() {
        System.out.println("Display Method from D");
    }

}
