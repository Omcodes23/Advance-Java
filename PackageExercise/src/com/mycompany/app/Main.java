// Main.java

package com.mycompany.app;
import com.mycompany.math.Calculator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Use the add method and display the result
        int sumResult = calculator.add(10, 5);
        System.out.println("Sum: " + sumResult);

        // Use the subtract method and display the result
        int subtractResult = calculator.subtract(20, 7);
        System.out.println("Difference: " + subtractResult);
    }
}
