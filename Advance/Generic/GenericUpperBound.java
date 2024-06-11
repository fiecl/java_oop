package Advance.Generic;

public class GenericUpperBound {
    // Bounded type parameter example
    public static <T extends Number> void printNumber(T number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        printNumber(10); // Works
        printNumber(3.14); // Works
        // printNumber("Hello"); // Error: String is not a subtype of Number
    }
}