package day07;

public class StaticAndInstanceInitializersDemo {
    private static  int M;
    private static  int D;

    static {
        System.out.println("Static Initializer Block Executed");
        M=10;
        D=200;
        System.out.println(M);
        System.out.println(D);
        System.out.println(D-M);
        System.out.println((D*M)-M);
    }
    {
        System.out.println("Instance Initializer Block Executed");
    }

    public StaticAndInstanceInitializersDemo() {
        System.out.println("Constructor Executed");
    }

    public static void staticMethod(){
        System.out.println("Static Method Executed");
    }

    public void instanceMethod(){
        System.out.println("Instance Method Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        StaticAndInstanceInitializersDemo demo = new StaticAndInstanceInitializersDemo();
        staticMethod();
        demo.instanceMethod();
        System.out.println();
        StaticAndInstanceInitializersDemo demo01 = new StaticAndInstanceInitializersDemo();
    }
}
