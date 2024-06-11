// A Java Comparator is an interface used to define a custom order for objects that are not inherently comparable. This interface is part of the java.util package and is typically used for sorting collections or arrays of objects that do not have a natural ordering, or when you need to order objects in a way different from their natural ordering defined by the Comparable interface.

// Key Features of Comparator
// 1. Custom Ordering: Allows defining custom order logic for sorting.
// 2. Multiple Comparisons: Can create multiple different comparisons for a single class.
// 3. Flexibility: Can be used to compare objects of different types or customize comparison logic at runtime.

// Comparator Interface Methods
// The Comparator interface contains two primary methods:

// 1. compare(T o1, T o2): Compares its two arguments for order. Returns a negative integer, zero, or a positive integer if the first argument is less than, equal to, or greater than the second, respectively.
// 2. equals(Object obj): Indicates whether some other object is "equal to" this comparator. This method is not typically overridden; the default implementation from Object is usually sufficient.

package Advance.Comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age); // You can also use Float.compare() if using float values
    }
}

public class ComparatorBasic {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting using AgeComparator
        Collections.sort(people, new AgeComparator());
        System.out.println(people); // Output: [Bob (25), Alice (30), Charlie (35)]
    }
}