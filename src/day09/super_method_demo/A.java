package day09.super_method_demo;

public class A {
    int a = 10;
    String name = "Class A";
    int x = 100;

    public void display(){
        System.out.println("This is class A");
    }

    public A() {
        System.out.println("Constructor of class A");
    }

    public A(int a,String name) {
        this.a=a;
        this.name=name;
    }

    public A(int a, int x) {
        this.a = a;
        this.x = x;
    }

    public A(int a, String name, int x) {
        this.a = a;
        this.name = name;
        this.x = x;
    }
}
