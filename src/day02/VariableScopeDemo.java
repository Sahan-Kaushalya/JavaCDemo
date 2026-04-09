package day02;

public class VariableScopeDemo {

    // instance variable
    private int instanceVar = 5;
    private String instanceString = "Instance String";

    // static variable
    public static int staticVar = 10;
    private static String staticString = "Static String";


    // constant variable
    private static final int CONSTANT_VAR = 10;
    private static final String CONSTANT_STRING = "Constant String";

    private  int methodVar; // Method variable (instance variable used in method)
    public static void demo(){

        final  int lovalVar = 25; // local variable
        System.out.println("Variable Scope Demo .");

        int x= 10;
        {
            final String blockVar = "Block Variable";
            int y = 20;
            System.out.println("Inside Block X="+x+", Y="+y);
        }
        // y is not accessible here
        System.out.println("Outside Block X="+x);
    }

    public  void instanceMethode(){
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Instance string: " + instanceString);
    }

    public static double staticMethod(){
        return staticVar;
    }


    public static void main(String[] args) {

        // local variable
        int localVar = 15;
        String localString = "Local String";

        // accessing instance variables
        VariableScopeDemo demo = new VariableScopeDemo();
        System.out.println("Instance variable: " + demo.instanceVar);
        System.out.println("Instance string: " + demo.instanceString);

        // accessing constant variables
        System.out.println("Constant variable: " + CONSTANT_VAR);
        System.out.println("Constant string: " + CONSTANT_STRING);

        // accessing local variables
        System.out.println("Local variable: " + localVar);
        System.out.println("Local string: " + localString);

        System.out.println("\n...............\n");
        demo();
        System.out.println("\n...............\n");

        int localVariable = 200;
        System.out.println("This is a local variable :" +localVariable);


        double anotherLocalVariable = VariableScopeDemo.staticMethod();
        System.out.println("Accessing static variable From day02.VariableScopeDemo " + anotherLocalVariable);
    }

}
