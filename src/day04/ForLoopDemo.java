package day04;



public class ForLoopDemo {
    public static void main(String[] args) {

        int sum = 0;
        for(int i =1;i<=10;i++){
            sum+=i; // sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("Sum of the first 10 natural numbers : "+sum);

        String[] students={"Kaushalya","Ishara","Kavindu","Kavitha","Kamal","Nimal","Arun","Namal","Anura","Sajith"};
        System.out.println("\n Students List \n");
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
    }

}
