package day05;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int grade;

    // Default (No-argument) constructor
    // Constructor overloading
    public Student() { 
    }

    // Parameterized constructor (with 2 parameters)
    // Constructor overloading
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Fully Parameterized constructor (with all parameters) || All-argument constructor
    // Constructor overloading
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
