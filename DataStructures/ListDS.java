package DataStructures;

import java.util.Arrays;
import java.util.List;

public class ListDS {
    
    public static void main(String[] args) {

        Integer[] numbersArr = {1,2,3,4,5};
        
        // Arrays.asList
        List<Integer> numbersList = Arrays.asList(numbersArr);

        System.out.println(numbersList);
    }
}