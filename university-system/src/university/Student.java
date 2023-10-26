// src/university/Student.java
package university;

public class Student extends Person {
    private int studentId;
    private String major;
    private float gpa;

    public Student(String name, int age, String address, String email, int studentId, String major, float gpa) {
        super(name, age, address, email);
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    // Getters and setters...

    @Override
    public void displayDetails() {
        System.out.println("Student Details: " + getName() + ", ID: " + studentId + ", Major: " + major + ", GPA: " + gpa);
    }
}
