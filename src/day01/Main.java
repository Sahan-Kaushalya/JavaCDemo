package day01;

public class Main {
    public static void dataType(){
        int a =10;
        int b = 20;

        System.out.println(a+b);

        a=3;
        System.out.println(a);
        a=b;

        System.out.println(a);
        System.out.println(b);


        float f = 3.14f;
        float f2 =5;
        double d = 3.14;
        double d2 = 5;

        System.out.println("float value "+f);
        System.out.println("float value "+f2);
        System.out.println("double value "+d);
        System.out.println("double value "+d2);

        System.out.println("d + d2 value "+d+d2);
        System.out.println("f + f2 value "+f+f2);
        System.out.println("int + double = "+a+d);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is my first commit");
        System.out.println("IDET | Institute of Digital Engineering Technology (PVT.) LTD");
        System.out.println("\n");
        dataType();
    }
}
