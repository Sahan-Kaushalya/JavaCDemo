public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        // Primitive Types in java

        int intValue =10;
        double doubleValue = 3.14;
        boolean booleanValue = true;
        char charValue = 'A';

        // Printing the values of the variables

        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("Character Value: " + charValue);

        // Demonstrating type Casting

        double castedDouble = intValue; // implicit casting (int to double)
        int castedInt = (int) doubleValue; // explicit casting (double to int)

        System.out.println("Casted Double Value: " + castedDouble);
        System.out.println("Casted Int Value: " + castedInt);
    }
}
