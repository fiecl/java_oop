package Advance.Comparator;

import java.util.*;

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

public class ComparatorChaining {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));

        // Chaining AgeComparator and NameComparator
        people.sort(new AgeComparator().thenComparing(new NameComparator()));
        System.out.println(people); // Output: [Alice (30), Bob (30), Charlie (35)]
    }
}
