package day06;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        // Binary search requires a SORTED array
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 10;

        int resultIndex = binarySearch(numbers, target);

        System.out.println("\nBinary Search Demo");
        if (resultIndex != -1) {
            System.out.println("\nElement " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("\nElement " + target + " not found in the array.");
        }
    }

    /**
     * Performs a binary search on the given sorted array.
     * Theory: Binary search compares the target value to the middle element of the array.
     * If they are not equal, the half in which the target cannot lie is eliminated
     * and the search continues on the remaining half.
     *
     * @param arr The sorted array to search through
     * @param key The value to look for
     * @return The index of the key if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            if (arr[mid] == key) {
                return mid; // Key found
            }

            if (arr[mid] < key) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return -1; // Key not found
    }

}
