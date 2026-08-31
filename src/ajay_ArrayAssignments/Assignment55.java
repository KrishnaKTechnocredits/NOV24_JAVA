package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment55 {

    int[] unionArray(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            union[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            union[arr1.length + j] = arr2[j];
        }

        return union;
    }

    public static void main(String[] args) {
        Assignment55 assignment55 = new Assignment55();

        int[] arr1 = {10, 19, 18};
        int[] arr2 = {99, 8};
        int[] unionResult = assignment55.unionArray(arr1, arr2);
        System.out.println("Union of arrays: " + Arrays.toString(unionResult));
    }
}