package day04;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
         int sum = 0;
         int i =1;
         do {
             sum+=i;
             i++;
         }while (i<=10);
         System.out.println("\n Sum of the first 10 natural numbers : "+sum);

        String[] students={"Kaushalya","Ishara","Kavindu","Kavitha","Kamal","Nimal","Arun","Namal","Anura","Sajith"};
        System.out.println("\n____________________________ Students List ____________________________ \n");
        int s =0;
        do{
            System.out.println(students[s]);
            s++;
        }while (s<students.length);
        System.out.println("\n____________________________ Students List ____________________________ \n");
    }
}
