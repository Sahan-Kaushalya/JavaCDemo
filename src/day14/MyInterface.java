package day14;

@FunctionalInterface
interface MyInterface {
    int calculate(int a, int b);
}

class Test {
    public static void main(String[] args) {
        //Anonymous inner class implementing MyInterface
        MyInterface myInterface = new MyInterface() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        
        System.out.println("Result from Anonymous Inner Class: " + myInterface.calculate(10, 5));

        // Lambda expression implementing MyInterface
        // Since the interface method accepts two integers, the lambda needs to declare two parameters
        MyInterface m1 = (a, b) -> {
            return a + b;
        };

        // You can also write it even shorter without curly braces or the 'return' keyword
        MyInterface m2 = (a, b) -> a + b;

        // Calling the method using the lambda instance
        System.out.println("Result from Lambda m1 (2 + 1): " + m1.calculate(2, 1));
        System.out.println("Result from Lambda m2 (5 + 3): " + m2.calculate(5, 3));
    }
}
