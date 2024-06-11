package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class ArrayListDS {
    
    // @SuppressWarnings("unchecked") // Suppress unchecked cast warning
    public static void main(String[] args) {

        Integer[] numbersArr = {1, 2, 3, 4, 5};
        List<Integer> numbersList = Arrays.asList(numbersArr);
        
        // List<Integer> numbers = Arrays.asList(numbersArr);
        ArrayList<Integer> numbers = new ArrayList<>(numbersList);
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
    
        System.out.println(numbersList);
        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(numbersList.getClass().getSimpleName()); // ArrayList
        System.out.println(numbers.getClass().getSimpleName()); // ArrayList

        // add()
        Integer[] oddArr = {1, 3, 5, 7, 9};
        ArrayList<Integer> odds = new ArrayList<>(Arrays.asList(oddArr));
        System.out.println("odds: " + odds);
        odds.add(11);
        odds.add(13);
        System.out.println("odds updated: " + odds);

        // addAll()
        Integer[] evenArr = {2, 4, 6, 8, 10};
        ArrayList<Integer> evens = new ArrayList<>(Arrays.asList(evenArr));
        ArrayList<Integer> combinedOddsAndEvens = new ArrayList<>();
        combinedOddsAndEvens.addAll(odds);
        combinedOddsAndEvens.addAll(evens);
        System.out.println("combined odds and evens: " + combinedOddsAndEvens);

        // sort() + clone(): Collections.sort() is a mutator method
        Collections.sort(combinedOddsAndEvens);
        ArrayList<Integer> sortedCombinedOddsAndEvens = (ArrayList<Integer>) combinedOddsAndEvens.clone();
        System.out.println("sorted combined odds and evens: " + sortedCombinedOddsAndEvens);

        // contains()
        boolean isNumberExisting1 = combinedOddsAndEvens.contains(13);
        Boolean isNumberExisting2 = combinedOddsAndEvens.contains(14);
        System.out.println("isNumberExisting1: " + isNumberExisting1);
        System.out.println("isNumberExisting2: " + isNumberExisting2);

        // ensureCapacity()
        ArrayList<Integer> nums = new ArrayList<>();
        nums.ensureCapacity(20);
        for (int i = 1; i <= 20; i++) {
            nums.add(i);
        }
        System.out.println("nums: " + nums);
        
        // get()
        System.out.println("The first element of combined odds and evens is: " + combinedOddsAndEvens.get(0));

        // indexOf() and lastIndexOf() practical usage (REMOVING DUPLICATES)
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "banana"));
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.indexOf(fruits.get(i)) != fruits.lastIndexOf(fruits.get(i))) {
                fruits.remove(i);
                i--; // Adjust the index after removal
            }
        }
        System.out.println("No duplicates in fruits: " + fruits);

        // remove()
        // 1. by index
        String removedElemFromFruits = fruits.remove(fruits.size() - 1);
        System.out.println("the removed elem from fruits is: " + removedElemFromFruits);
        System.out.println("fruits without the last elem, banana: " + fruits); // remove last elem

        // 2. by object
        boolean isRemoveSuccessful = nums.remove(Integer.valueOf(21));
        boolean isRemoveSuccessful2 = nums.remove(Integer.valueOf(1));
        System.out.println("isRemoveSuccessful: " + isRemoveSuccessful);
        System.out.println("isRemoveSuccessful2: " + isRemoveSuccessful2);
        System.out.println("nums without 1: " + nums);

        // map()
        List<Integer> mappedNumsList = numbers.stream()
                                            .map(num -> num * 2)
                                            .collect(Collectors.toList());
        System.out.println(mappedNumsList.getClass().getSimpleName());                                    
        // ArrayList<Integer> mappedNums = new ArrayList<>(mappedNumsList);
        System.out.println(mappedNumsList);

        // forEach()
        mappedNumsList.forEach(x -> System.out.println(String.format("The value is %d", x)));

        // replaceAll()
        mappedNumsList.replaceAll(a -> a * 3); // map() function counterpart except that it is mutator (modifies the original ArrayList)
        System.out.println(mappedNumsList);

        // removeIf()
        mappedNumsList.removeIf(a -> a % 2 == 0);
        System.out.println(mappedNumsList);

        // trimToSize()


        

    }
}