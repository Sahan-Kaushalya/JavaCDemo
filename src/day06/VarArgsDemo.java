package day06;

public class VarArgsDemo {

    /* Rules for VarArgs in Java:
        1. A method can have only one varargs parameter.
        2. The varargs parameter must be the last parameter in the method signature.
        3. Varargs can accept zero or more arguments.
        4. Inside the method, the varargs parameter is treated as an array.
        5. You can pass an array directly to a varargs parameter.
    *
    * */
    public static void main(String[] args) {
        // Demonstrating Variable Arguments (Varargs)
        // Varargs allow a method to accept zero or multiple arguments of the same type.
        System.out.println();
        System.out.println("Sum of 1-10: "+sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Sum of 2, 4: " + sum(2, 4));
        System.out.println("Sum of 10, 20, 30, 40: " + sum(10, 20, 30, 40));
        System.out.println("Sum of empty list: " + sum());

        printDetails("Admin", 101, 102, 103);
        printDetails("Guest", 50);
    }

    /**
     * A method that uses varargs (...) to sum an arbitrary number of integers.
     * Inside the method, 'numbers' is treated as an array (int[]).
     */
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    /**
     * A method with a regular parameter and a varargs parameter.
     * Note: The varargs parameter must be the LAST parameter in the method signature.
     */
    public static void printDetails(String role, int... ids) {
        System.out.print("\nRole: " + role + " | IDs: ");
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

}
