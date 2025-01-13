package anuja.collection;

import java.util.*;

// Return the list of elements having frequency more than 1 from a given Array. [IMP]
// int[] arr = {10, 44, 55, 22, 44, 11, 77, 88, 99, 11};
// output : [44, 11], using collections method only. Already same program is there in Array too.
public class Assignment82 {

    public static void main(String[] args) {
        Assignment82 assignment82 = new Assignment82();
        int[] arr = {10, 44, 55, 22, 44, 11, 77, 88, 99, 11};
        System.out.println("Input: \n" + Arrays.toString(arr));
        List<Integer> outputList = assignment82.getNewListOfDuplicateNums(arr);
        System.out.println("Output list is: \n" + outputList);
    }

    // Method to return a new list with only duplicate numbers from a given array
    private List<Integer> getNewListOfDuplicateNums(int[] arr) {
        // Create a list from the array
        List<Integer> arrList = new ArrayList<>(); // We have to create a list from the array.
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]); // Add array elements to the list.
        }

        // Create a new list to store the duplicate elements
        List<Integer> duplicateElementList = new ArrayList<>();
        // Iterate over the array and check for duplicates using indexOf and lastIndexOf
        for (int num : arr) {
            if (arrList.indexOf(num) != arrList.lastIndexOf(num)) {
                if (!duplicateElementList.contains(num)) {
                    duplicateElementList.add(num);
                }
            }
        }

        return duplicateElementList;
    }
}
