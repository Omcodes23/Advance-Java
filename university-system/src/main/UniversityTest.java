// src/main/UniversityTest.java
package main;

import course.CourseImpl;
import course.EnrollmentException;
import university.Student;
import university.Professor;

public class UniversityTest {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, "123 Main St", "john.doe@example.com", 1001, "Computer Science", 3.8f);
        Professor professor1 = new Professor("Dr. Smith", 40, "456 Oak St", "smith@example.com", 2001, "Mathematics", 80000);

        CourseImpl javaCourse = new CourseImpl("Java Programming");

        try {
            javaCourse.enrollStudent(student1);
//            javaCourse.enrollStudent(new Student("Jane Smith", 22, "789 Pine St", "jane.smith@example.com", 1002, "Physics", 3.5));
            javaCourse.enrollStudent(new Student("Jane Smith", 22, "789 Pine St", "jane.smith@example.com", 1002, "Physics", 3.5f));
// Note the 'f' after the GPA value to indicate it is a float.


//            javaCourse.enrollStudent(new Student("Jane Smith", 22, "789 Pine St", "jane.smith@example.com", 1002, "Physics", 3.5));
        } catch (EnrollmentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        student1.displayDetails();
        professor1.displayDetails();
        javaCourse.listStudents();
    }
}

