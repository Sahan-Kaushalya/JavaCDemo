public class VariableScopeDemo {

    // instance variable
    private int instanceVar = 5;
    private String instanceString = "Instance String";

    // constant variable
    private static final int CONSTANT_VAR = 10;
    private static final String CONSTANT_STRING = "Constant String";

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

    }
}
