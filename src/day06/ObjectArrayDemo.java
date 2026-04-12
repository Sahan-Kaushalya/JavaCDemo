package day06;

import day05.Student;

public class ObjectArrayDemo {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Initializing the array with Student objects
        students[0] = new Student(1, "Alice",11);
        students[1] = new Student(2, "Bob",10);
        students[2] = new Student(3, "Charlie",9);

        // Displaying the Student objects
        System.out.println("Student Objects:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
