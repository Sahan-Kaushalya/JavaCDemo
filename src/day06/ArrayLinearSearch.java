package day06;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 43, 12, 5, 88, 30, 15, 14, 10, 80, 99, 20, 41, 57,
                25, 77, 95, 44, 101, 924, 204, 454, 505, 100};
        int target = 505;

        int resultIndex = linearSearch(numbers, target);

        if (resultIndex != -1) {
            System.out.println("\nElement " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("\nElement " + target + " not found in the array.");
        }
    }

    /**
     * Performs a linear search on the given array.
     * Theory: Linear search checks each element of the list sequentially
     * until a match is found or the whole list has been searched.
     *
     * @param arr The array to search through
     * @param key The value to look for
     * @return The index of the key if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index immediately when found
            }
        }
        return -1; // Return -1 if the loop finishes without finding the key
    }

}
