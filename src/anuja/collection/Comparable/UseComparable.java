package anuja.collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class UseComparable {

    // Method to demonstrate sorting using Comparable
    public void m1() {
        // Create an ArrayList to hold objects of ComprableInOneClass
        ArrayList<ComprableInOneClass> newList = new ArrayList<>();
        
        // Adding objects to the list
        newList.add(new ComprableInOneClass(4, "anuja", 98, 'A'));
        newList.add(new ComprableInOneClass(1, "Mahendra", 100, 'C'));
        newList.add(new ComprableInOneClass(2, "Ranu", 40, 'D'));
        newList.add(new ComprableInOneClass(3, "Tai", 100, 'A'));

        // Display list before sorting
        System.out.println("Before sorting: \n" + newList);
        System.out.println("---------------------------");

        // Sorting the list using Collections.sort() which relies on Comparable
        Collections.sort(newList);

        // Display list after sorting
        System.out.println("After sorting: \n" + newList);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        new UseComparable().m1();  // Calling the method to demonstrate sorting
    }
}
