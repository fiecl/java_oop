// ISSUE ENCOUNTERED: Not using '& Comparable<T>' still made Arrays.sort() usable, rendering this to be USELESS.

// package Advance.Generic;

// import java.util.Arrays;

// public class GenericMultipleBounds {
//     // Example of multiple bounds
//     public static <T extends Number & Comparable<T>> void sortAndPrint(T[] array) {
//         Arrays.sort(array);
//         for (T element : array) {
//             System.out.println(element + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Integer[] intArray = {3, 1, 4, 1, 5};
//         sortAndPrint(intArray); // Output: 1 1 3 4 5

//         String[] strArray = {"Project", "Sekai"};
//         // sortAndPrint(strArray);
//     }
// }