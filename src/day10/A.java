package day10;

public class A {
    static {
        System.out.println("Static initializer block of A");
    }

    {
        System.out.println("Instance initializer block of A");
    }

    public A() {
        System.out.println("Constructor of A");
    }

    public String stringInfo() {
        return "This is class A";
    }

}
