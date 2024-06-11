// <?> is a wildcard that represents an unknown type. It is used when you want to specify that a parameter can be of any type, but you do not need to know or use the exact type.
// Wildcards are useful in method parameters, particularly for methods that operate on collections or other generic types without modifying them.

package Advance.Generic.Wildcard;

import java.util.Arrays;
import java.util.List;

public class GenericUnboundedWildcard {

    public static void printList(List<?> list) {

        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        printList(intList);
    }
}