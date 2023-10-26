// Main.java

public class Main {
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("John Doe", 25, "123 Main St");
        Person person2 = new Person("Jane Smith", 30, "456 Oak St");

        // Display information using getter methods
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());
        System.out.println();

        // Modify the address of person1 using setter method
        person1.setAddress("789 Pine St");

        // Display updated information
        System.out.println("Person 1 (after modifying address):");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
    }
}
