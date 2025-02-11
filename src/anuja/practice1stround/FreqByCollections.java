package anuja.practice1stround;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FreqByCollections {

    /**
     * This method calculates the frequency of each character in a given word
     * and determines the character with the maximum frequency.
     *
     * @param word The input string to analyze.
     */
    void getAllCharFrequency(String word) {
        // Convert the input string into a character array
        char[] arr = word.toCharArray();

        // TreeMap to store characters (sorted order) and their frequencies
        Map<Character, Integer> mapOfCharFreq = new TreeMap<>();

        // Count frequencies of characters
        for (char ch : arr) {
            if (mapOfCharFreq.containsKey(ch)) {
                int count = mapOfCharFreq.get(ch);
                mapOfCharFreq.put(ch, count + 1);
            } else {
                mapOfCharFreq.put(ch, 1);
            }
        }

        // Initialize variables to track the character with max frequency
        int max = 0;
        char maxCh = ' ';

        // Iterate through the map to find the character with max frequency
        for (char key : mapOfCharFreq.keySet()) {
            int value = mapOfCharFreq.get(key);
            System.out.println(key + "->" + value);

            if (max < value) {
                max = value;
                maxCh = key;
            }
        }

        // Print the character with maximum frequency
        System.out.println(maxCh + "-->" + max);
    }

    /**
     * This method calculates the frequency of each character in a given word
     * and prints all characters with the maximum frequency.
     *
     * @param word The input string to analyze.
     */
    void getAllCharFrequency1(String word) {
        // Convert the input string into a character array
        char[] arr = word.toCharArray();

        // TreeMap to store characters (sorted order) and their frequencies
        Map<Character, Integer> mapOfCharFreq = new TreeMap<>();

        // Count frequencies of characters
        for (char ch : arr) {
            if (mapOfCharFreq.containsKey(ch)) {
                int count = mapOfCharFreq.get(ch);
                mapOfCharFreq.put(ch, count + 1);
            } else {
                mapOfCharFreq.put(ch, 1);
            }
        }

        // Variable to track the maximum frequency
        int max = 0;

        // Print all character frequencies and find the maximum frequency
        for (char key : mapOfCharFreq.keySet()) {
            int value = mapOfCharFreq.get(key);
            System.out.println(key + "->" + value);

            if (max < value) {
                max = value;
            }
        }

        // Print the maximum frequency
        System.out.println("Maximum Frequency: " + max);
        System.out.println("==============================");

        // Print all characters with the maximum frequency
        for (char key : mapOfCharFreq.keySet()) {
            int value = mapOfCharFreq.get(key);
            if (value == max) {
                System.out.println("Character with Maximum Frequency: " + key);
            }
        }
    }

    public static void main(String[] args) {
        String str = "aakankshakkakak"; // Input string
        new FreqByCollections().getAllCharFrequency1(str); // Call the method
    }
}

/**
 * ===============================
 * SUMMARY: CHARACTER FREQUENCY LOGIC
 * ===============================
 * - Input: A string where you need to calculate character frequencies.
 * - Output:
 *   1. Frequency of each character.
 *   2. Character(s) with the maximum frequency.
 * - Approach:
 *   1. Use a Map to store characters as keys and their frequencies as values.
 *   2. Use a loop to iterate through the string and populate the Map.
 *   3. Use another loop to find and print the maximum frequency and the corresponding characters.

 * ===============================
 * QUICK HANDY NOTES / CHEAT LIST
 * ===============================
 * 1. **Map to Use**: TreeMap (sorted order) or HashMap (unsorted but faster).
 * 2. **Logic**:
 *    - Check if a character exists in the map:
 *      `if (map.containsKey(ch)) { map.put(ch, map.get(ch) + 1); } else { map.put(ch, 1); }`
 * 3. **Finding Max Frequency**:
 *    - Iterate through `keySet()` or `entrySet()` of the map:
 *      `if (max < map.get(key)) { max = map.get(key); maxCh = key; }`
 * 4. **Iterating a Map**:
 *    - `for (char key : map.keySet()) { System.out.println(key + " -> " + map.get(key)); }`
 * 5. **Common Methods for Map**:
 *    - `containsKey(key)`: Checks if a key exists.
 *    - `put(key, value)`: Adds or updates a key-value pair.
 *    - `get(key)`: Retrieves the value for the given key.
 *    - `keySet()`: Returns a Set of all keys.
 *    - `entrySet()`: Returns a Set of key-value pairs.

 * ===============================
 * TIPS:
 * ===============================
 * - Use TreeMap if you want sorted order of keys.
 * - Use HashMap if you need faster performance (unsorted).
 * - Always check for edge cases like an empty string or single-character input.
 * - `getOrDefault()` can simplify increment logic:
 *   `map.put(ch, map.getOrDefault(ch, 0) + 1);`
 */
