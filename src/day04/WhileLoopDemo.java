package day04;

public class WhileLoopDemo {
    public static void main(String[] args) {

        String[] students={"Kaushalya","Ishara","Kavindu","Kavitha","Kamal","Nimal","Arun","Namal","Anura","Sajith"};
        System.out.println("\n____________________________ Students List ____________________________ \n");
        int s =0;
        while (s< students.length){
            System.out.println(students[s]);
            s++;
        }
        System.out.println("\n ____________________________ Students List ____________________________\n");

        int sum = 0;
        int i = 1;
        while (i<=10){
            sum +=i;
            i++;
        }
        System.out.println("Sum of the first 10 natural numbers : "+sum);
    }
}
