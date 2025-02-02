package anuja.collection.Iterator;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        // Step 1: Create a Set (using TreeSet)
        // TreeSet is a concrete implementation of the Set interface, which stores elements in sorted order.
        Set<String> nameSet = new TreeSet<>();

        // Step 2: Add some elements to the TreeSet
        nameSet.add("Anuja");
        nameSet.add("Mahendra");
        nameSet.add("Pallavi");
        nameSet.add("Aarya");
        nameSet.add("Ankit");
        nameSet.add("Dan");

        // Step 3: Print the original Set
        System.out.println("Original Set (TreeSet): " + nameSet);
        
        // Step 4: Get an Iterator object for the TreeSet
        // The iterator() method is implemented in the TreeSet class, which uses a TreeMap internally.
        Iterator<String> iterator = nameSet.iterator();

        // Step 5: Traverse the Set using the Iterator
        System.out.println("Traversing the Set using Iterator:");
        while (iterator.hasNext()) { // Check if there are more elements
            String name = iterator.next(); // Retrieve the next element
            System.out.println(name); // Print the element
        }

        // Step 6: Add a HashSet example to understand the difference
        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(nameSet); // Add all elements from TreeSet to HashSet

        // Print the HashSet
        System.out.println("\nOriginal Set (HashSet): " + hashSet);

        // Get an Iterator for the HashSet
        Iterator<String> hashSetIterator = hashSet.iterator();

        // Traverse the HashSet using the Iterator
        System.out.println("Traversing the HashSet using Iterator:");
        while (hashSetIterator.hasNext()) {
            String name = hashSetIterator.next();
            System.out.println(name);
        }
    }
}

/* NOTES:
 * 1. The `TreeSet` stores elements in natural sorted order. 
 *    - It uses a `TreeMap` internally, and its `iterator()` method returns an iterator for the keys of the TreeMap.
 * 2. The `HashSet` stores elements in an unordered manner.
 *    - It uses a `HashMap` internally, and its `iterator()` method returns an iterator for the keys of the HashMap.
 * 3. `Iterator` Interface:
 *    - The `Iterator` is an interface that provides methods to iterate over elements (`hasNext()` and `next()`).
 *    - Both `TreeSet` and `HashSet` provide specific implementations of the `Iterator` interface.
 * 4. Program Flow:
 *    - We first traverse a `TreeSet` using its iterator.
 *    - Then, we add the same elements to a `HashSet` and traverse it using its iterator to see the difference in ordering.
 */
