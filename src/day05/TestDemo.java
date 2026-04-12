package day05;

public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Sahan Kaushalya");
        student1.setGrade(12);

        Student student2 = new Student(2,"Yohan Silva",10);
        Student student3 = new Student(3,"Sajith Perera",5);
        Student student4 = new Student(4,"Jonny Silva",9);
        Student student5 = new Student(5,"Polkura Kulathilaka",11);


        System.out.println();
        System.out.println("Student Object: " + student1);
        System.out.println("Student Object: " + student2);
        System.out.println("Student Object: " + student3);
        System.out.println("Student Object: " + student4);
        System.out.println("Student Object: " + student5);
    }
}
