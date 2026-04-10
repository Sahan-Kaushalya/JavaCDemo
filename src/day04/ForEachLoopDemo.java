package day04;

public class ForEachLoopDemo {
    public static void main(String[] args) {

        int[] numbers ={10,20,30,40,50};
        System.out.println("Numberss in the array:");
        for(int num:numbers){
            System.out.println(num);
        }

        String[] fruits ={"Apple","Banana","Orange","Grapes","Mango","Pineapple","Strawberry"};
        System.out.println("\nFruits in the array:");
        for(String f:fruits){
            System.out.println(f);
        }

        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("\nMatrix in the array:");
        for(int[] row:matrix){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
