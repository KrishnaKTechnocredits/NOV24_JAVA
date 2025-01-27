package anuja.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Assignment - 95 : 26th Jan'2025
 * 
 * Problem Statement:
 * Given a string with words separated by spaces, count the frequency of each word.
 * Output the frequency of all words and then filter out words with frequency > 1.
 * 
 * Input String: 
 * "Hi Hello Hi Hi Pune India Pune India India City"
 * 
 * Expected Output: 
 * Complete Frequency Map: 
 * {Hi=3, Hello=1, Pune=2, India=3, City=1}
 * 
 * Filtered Map (frequency > 1): 
 * {Hi=3, Pune=2, India=3}
 */

public class Assignment95 {

    public static void main(String[] args) {
        // Input string for word frequency calculation
        String str = "Hi Hello Hi Hi Pune India Pune India India City";

        // Creating an object and invoking the processData method
        new Assignment95().processData(str);
    }

    /*
     * processData() Method
     * ---------------------
     * This method processes the input string to:
     * 1. Calculate the frequency of each word.
     * 2. Print the complete map of word frequencies.
     * 3. Filter and print words with frequency > 1.
     * 
     * Key Steps:
     * - Split the input string into words.
     * - Use a HashMap to store and calculate word frequencies.
     * - Call iterateOnMap() to filter the map.
     */
    private void processData(String str) {
        // Step 1: Split the input string into words and store in a list
        List<String> listStr = new ArrayList<>(Arrays.asList(str.split(" ")));
        System.out.println("List of Words: " + listStr);

        // Step 2: Create a HashMap to store word frequencies
        Map<String, Integer> mapOfWordAndFreq = new HashMap<>();

        // Step 3: Iterate through the list to calculate word frequencies
        for (String word : listStr) {
            if (mapOfWordAndFreq.containsKey(word)) {
                // Increment frequency if word already exists in the map
                mapOfWordAndFreq.put(word, mapOfWordAndFreq.get(word) + 1);
            } else {
                // Add word to the map with frequency 1
                mapOfWordAndFreq.put(word, 1);
            }
        }

        // Step 4: Print the complete frequency map
        System.out.println("Complete Frequency Map: " + mapOfWordAndFreq);
        System.out.println("-----------------------------------");

        // Step 5: Filter the map to retain only words with frequency > 1
        iterateOnMap(mapOfWordAndFreq);
    }

    /*
     * iterateOnMap() Method
     * ---------------------
     * This method filters the given map by removing entries with frequency <= 1.
     * 
     * Key Steps:
     * - Use an Iterator to traverse the map.
     * - Use Iterator's remove() method to safely remove entries during iteration.
     * 
     * Important:
     * - Avoid using map.remove() directly while iterating; it causes ConcurrentModificationException.
     */
    void iterateOnMap(Map<String, Integer> mapOfWordAndFreq) {
        // Step 1: Create an iterator for the map's entry set
        Iterator<Map.Entry<String, Integer>> iterator = mapOfWordAndFreq.entrySet().iterator();

        // Step 2: Iterate through the map
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            // Step 3: Check if the frequency is <= 1 and remove it
            if (entry.getValue() <= 1) {
                iterator.remove(); // Safe removal using iterator
            }
        }

        // Step 4: Print the filtered map
        System.out.println("Filtered Map (frequency > 1): \n" + mapOfWordAndFreq);
    }
}