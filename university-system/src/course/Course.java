// src/course/Course.java
package course;

import university.Student;

public interface Course {
    void enrollStudent(Student student) throws EnrollmentException;
    void listStudents();
}
