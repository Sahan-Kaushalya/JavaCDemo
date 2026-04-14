package day07;

public class ArraySelectionSort {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 100, 1, 48};

        System.out.println("Array Before Selection Sort:");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("\nArray After Selection Sort:");
        printArray(numbers);
    }

    /**
     * Selection Sort Algorithm:
     * Repeatedly finds the minimum element from the unsorted part
     * and puts it at the beginning.
     * Time Complexity: O(n^2)
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
