package day07;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] numbers = {100,105,10,48,1,64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array Before Bubble Sort:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nArray After Bubble Sort:");
        printArray(numbers);
    }

    /**
     * Bubble Sort Algorithm:
     * Repeatedly steps through the list, compares adjacent elements
     * and swaps them if they are in the wrong order.
     * Time Complexity: O(n^2)
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) { // outer loop for passes
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) { // inner loop for comparisons
                if (arr[j] > arr[j + 1]) { // If arr[j] is greater than arr[j+1], swap them
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
