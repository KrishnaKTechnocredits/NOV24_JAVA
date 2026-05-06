package anuja.collection.Iterator;

import java.util.*;

public class IteratorOnMap {
    public static void main(String[] args) {
        IteratorOnMap iteratorOnMap = new IteratorOnMap(); // Object of the class
        
        // Create TreeMap and HashMap to demonstrate iterating over Maps
        Map<String, Integer> treeMapOfNameAndAge = new TreeMap<String, Integer>();
        Map<String, Integer> hashMap1 = new HashMap<String, Integer>();

        // Adding data to TreeMap (TreeMap keeps keys sorted)
        treeMapOfNameAndAge.put("Anuja", 34);
        treeMapOfNameAndAge.put("Pallavi", 38);
        treeMapOfNameAndAge.put("Anku", 29);
        treeMapOfNameAndAge.put("Aru", 2);
        treeMapOfNameAndAge.put("Anuja", 45); // Will overwrite the previous value for "Anuja"
        treeMapOfNameAndAge.put("Mahendrapla", 34);

        // Adding data to HashMap (HashMap does not guarantee any specific order)
        hashMap1.put("Anuja", 34);
        hashMap1.put("Pallavi", 38);
        hashMap1.put("Anku", 29);
        hashMap1.put("Aru", 2);
        hashMap1.put("Anuja", 45); // Will overwrite the previous value for "Anuja"
        hashMap1.put("Mahendrapla", 34);

        // Print the initial maps
        System.out.println("Input TreeMap is: " + treeMapOfNameAndAge);
        System.out.println("Input HashMap is: " + hashMap1);
        System.out.println();

        // Call methods to demonstrate iterating using Iterator
        System.out.println("Executed map with only values");
        iteratorOnMap.processMapUsingValue(treeMapOfNameAndAge);
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Executed map with keys");
        iteratorOnMap.processMapUsingKey(treeMapOfNameAndAge);
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Executed map with key and value pairs");
        iteratorOnMap.mapWithEntrySet(treeMapOfNameAndAge);
    }

    // Iterate over the Map using EntrySet (key-value pairs)
    private void mapWithEntrySet(Map<String, Integer> treeMapOfNameAndAge) {
        Iterator<Map.Entry<String, Integer>> iterator1 = treeMapOfNameAndAge.entrySet().iterator();
        
        // Loop through the EntrySet and print keys and values
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> mapData = iterator1.next();
            System.out.println("Key: " + mapData.getKey() + " and Value: " + mapData.getValue());
        }
        System.out.println();
    }

    // Iterate over the Map using only the keys (keySet)
    private void processMapUsingKey(Map<String, Integer> mapOfNameAndAge) {
        Iterator<String> iterator1 = mapOfNameAndAge.keySet().iterator(); // Get Iterator for keys
        
        System.out.println("Below is the key and value pair:");
        // Loop through the keySet and fetch values using the key
        while (iterator1.hasNext()) {
            String key1 = iterator1.next();
            Integer value1 = mapOfNameAndAge.get(key1); // Get value for the key
            System.out.println(key1 + " -----> " + value1); // Print key-value pair
        }
    }

    // Iterate over the Map using only the values (values())
    private void processMapUsingValue(Map<String, Integer> mapOfNameAndAge) {
        Iterator<Integer> iterator1 = mapOfNameAndAge.values().iterator(); // Get Iterator for values
        
        // Loop through the values and print each value
        while (iterator1.hasNext()) {
            Integer values = iterator1.next();
            System.out.println(values); // Print only the values
        }
    }
}//class end

/* CHEAT NOTES:
 * 1. **TreeMap vs HashMap**:
 *    - `TreeMap` sorts the keys in natural order, so when iterating over it, the keys are ordered.
 *    - `HashMap` does not guarantee any specific order of the keys, so iteration may return keys in random order.
 * 2. **EntrySet**:
 *    - `entrySet()` provides access to both the keys and values in a Map. It is useful when you need both the key and value in each iteration.
 *    - It returns a set of `Map.Entry` objects, where each entry holds a key-value pair.
 * 3. **KeySet**:
 *    - `keySet()` returns a set of all the keys in the map. You can use the key to retrieve the associated value using `map.get(key)`.
 * 4. **Values**:
 *    - `values()` returns a collection of all values in the map, but doesn't provide access to the keys.
 * 5. **Using Iterator**:
 *    - `Iterator` allows you to traverse a collection (e.g., Map, List, Set) in a controlled way, avoiding `ConcurrentModificationException`.
 *    - `hasNext()` checks if there are more elements, and `next()` retrieves the next element.
 * 6. **Important**:
 *    - The `put()` method in `Map` will overwrite the previous value if the same key is inserted again.
 *    - Both `TreeMap` and `HashMap` handle key-value pairs, but `TreeMap` maintains order, while `HashMap` does not.
 */
