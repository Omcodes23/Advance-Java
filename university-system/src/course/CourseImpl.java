// src/course/CourseImpl.java
package course;

import university.Student;

import java.util.ArrayList;
import java.util.List;

public class CourseImpl implements Course {
    private String courseName;
    private List<Student> enrolledStudents;
    private static final int MAX_STUDENTS = 20;

    public CourseImpl(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student student) throws EnrollmentException {
        if (enrolledStudents.size() < MAX_STUDENTS) {
            enrolledStudents.add(student);
        } else {
            throw new EnrollmentException("Course is full. Cannot enroll more students.");
        }
    }

    @Override
    public void listStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}
