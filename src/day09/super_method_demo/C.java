package day09.super_method_demo;

public class C extends B {
    int a = 109;
    String name = "Class C";
    int x = 130;

    @Override
    public void display() {
       // super.display(); // Call the method from class B
        System.out.println("This is class C");
    }

    public C() {
        System.out.println("Constructor of class C");
    }

    public C(int a) {
        //super(a); // Call the constructor of class B
        this.a = a;
    }

    public C(int a, int a1) {
        //super(a,a1);
    }

    public void specificFeature(){
        System.out.println("special for C");
    }

    @Override
    protected void testMethod() {
        System.out.println("this is protected for Class B");
    }

    public static void main(String[] args) {
//        C c1=new C(2);
//        C c2=new C(2,3);
//
//        c2.specificFeature();
//
//        B b1=new B(2);

        B b2=new C(5);
        b2.display();


//        A a1=new C(5);
//        A a2=new B(5);

        //D d1=new C(5);
    }
}
