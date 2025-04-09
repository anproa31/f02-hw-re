package buoi14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test Ex_01
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(1);
        intList.add(3);
        System.out.println("Original list: " + intList);
        System.out.println("Without duplicates: " + Ex_01.removeDuplicates(intList));

        // Test Ex_02
        String[] strArray = {"a", "b", "c"};
        System.out.println("Before swap: " + Arrays.toString(strArray));
        Ex_02.swap(strArray, 0, 2);
        System.out.println("After swap: " + Arrays.toString(strArray));

        // Test Ex_03
        List<String> stringList = List.of("a", "b", "a", "c", "a");
        System.out.println("Occurrences of 'a': " + Ex_03.countOccurrences(stringList, "a"));

        // Test Ex_04
        List<Number> numList = List.of(1, 2.5, 3L, 4.0f);
        System.out.println("Sum of numbers: " + Ex_04.sumNumbers(numList));
    }
}