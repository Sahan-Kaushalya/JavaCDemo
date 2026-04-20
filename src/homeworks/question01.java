package homeworks;


// Array : {1,8,20,400,5000,67,34,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0}
// 2nd largest value
// using math class
public class question01 {
    public static void main(String[] args) {
        double[] arrayDataSet = {1,8,20,400,5000,67,34,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0};
        selectionSort(arrayDataSet);
        System.out.println("\nUsing Selection Sort Algorithm");
        System.out.println("2nd largest value is: "+arrayDataSet[arrayDataSet.length-2]);

        System.out.println("\nUsing Math Class");
        double value = Math.round(arrayDataSet[arrayDataSet.length-2]*100.0)/100.0;
        System.out.println("2nd largest value is: "+value);
    }

    // Selection Sorting Algorithm
    public static void selectionSort(double[] arr) {
        int no = arr.length;
        for (int i = 0; i < no - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < no; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            double temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
