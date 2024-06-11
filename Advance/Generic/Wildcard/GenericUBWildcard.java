package Advance.Generic.Wildcard;

import java.util.Arrays;
import java.util.List;

public class GenericUBWildcard {
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        printNumbers(intList);
    }

}