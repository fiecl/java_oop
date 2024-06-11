package Advance.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorReverse {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting in reverse order using lambda expression
        people.sort(Comparator.comparingInt((Person p) -> p.age).reversed());
        System.out.println(people); // Output: [Charlie (35), Alice (30), Bob (25)]
    }
}