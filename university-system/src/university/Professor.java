// src/university/Professor.java
package university;

public class Professor extends Person {
    private int employeeId;
    private String department;
    private float salary;

    public Professor(String name, int age, String address, String email, int employeeId, String department, float salary) {
        super(name, age, address, email);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // Getters and setters...

    @Override
    public void displayDetails() {
        System.out.println("Professor Details: " + getName() + ", Employee ID: " + employeeId + ", Department: " + department + ", Salary: " + salary);
    }
}
