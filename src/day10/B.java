package day10;

public class B extends A{
    static {
        System.out.println("Static initializer block of B");
    }

    {
        System.out.println("Instance initializer block of B");
    }

    public B() {
        System.out.println("Constructor of B");
    }

    @Override
    public String stringInfo() {
        return "This is class B, which extends A";
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.stringInfo());

    }
}
