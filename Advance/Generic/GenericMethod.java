package Advance.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethod {
    // A generic method example
    // The <T> before the return type void indicates that this method is generic.
    // When you see <T>, it means that this method can operate on objects of any type T.
    // static: This keyword indicates that the method belongs to the class itself, rather than to any specific instance of the class. You can call a static method without creating an instance of the class.
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static <T> void printArrayList(ArrayList<T> arrayList) {
        arrayList.forEach(t -> System.out.println(t));
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray); // Output: 1 2 3 4 5
        printArray(stringArray); // Output: Hello World

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Project", "Sekai"));
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(100, 200, 300));

        printArrayList(stringArrayList);
        printArrayList(integerArrayList);
    }
}