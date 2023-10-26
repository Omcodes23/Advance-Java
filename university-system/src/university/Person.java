// src/university/Person.java
package university;

public abstract class Person {
    private String name;
    private int age;
    private String address;
    private String email;

    public Person(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other getters and setters...

    public abstract void displayDetails();
}
