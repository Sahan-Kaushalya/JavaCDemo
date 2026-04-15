package day09.super_method_demo;

public class B extends A{
    int a = 10;
    String name = "Class B";
    int x = 20;

    @Override
    public void display() {
        super.display();
        System.out.println("This is class B");
    }

    public B() {
        System.out.println("Constructor of class B");
    }

    public B(int a) {
        this.a = a;
    }

    public B(int a, String name, int a1) {
        super(a, name);
        this.a = a1;
    }

    public B(int a, String name, int x, int a1) {
        super(a, name, x);
        this.a = a1;
    }

    public B(int a, int a1) {
        super(a,a1);
        this.a = a1;
    }
}
