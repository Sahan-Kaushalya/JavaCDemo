public class AssigningWorngRangeValue {
    public static void main(String[] args) {

        byte b = 127; // Maximum value for byte
        System.out.println("Byte value: " + b);

        // Uncommenting the following line will cause a compile-time error
        // because 128 is out of the range of byte (-128 to 127)
        // byte b2 = 128; // This will cause an error

        short s = 32767; // Maximum value for short
        System.out.println("Short value: " + s);

        // Uncommenting the following line will cause a compile-time error
        // because 32768 is out of the range of short (-32768 to 32767)
        // short s2 = 32768; // This will cause an error

        int i = 2147483647; // Maximum value for int
        System.out.println("Int value: " + i);

        // Uncommenting the following line will cause a compile-time error
        // because 2147483648 is out of the range of int (-2147483648 to 2147483647)
        // int i2 = 2147483648; // This will cause an error

        long l = 9223372036854775807L; // Maximum value for long
        System.out.println("Long value: " + l);

        // Uncommenting the following line will cause a compile-time error
        // because 9223372036854775808 is out of the range of long (-9223372036854775808 to 9223372036854775807)
        // long l2 = 9223372036854775808L; // This will cause an error

    }
}
