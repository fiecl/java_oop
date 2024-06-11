package Advance.Comparator;

import java.util.List;
import java.util.ArrayList;

public class ComparatorLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting using lambda expression
        people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
        System.out.println(people); // Output: [Bob (25), Alice (30), Charlie (35)]
    }
}