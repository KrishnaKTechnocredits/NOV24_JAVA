package sindhu.assignment102to107;

import java.util.*;

public class Assignment105 {
    public static void main(String[] args) {
        Assignment105 a105 = new Assignment105();
        String word1 = "Listen";
        String word2 = "Silent";
        String word3 = "Techno";
        String word4 = "chnott";

        // call method to check fofr anagarm
        a105.checkIfAnagram(word1, word2); // True
        a105.checkIfAnagram(word3, word4); // False
    }

    public void checkIfAnagram(String word1, String word2) {
        // Convert both words to lowercase for case-insensitive comparison
        String lword1 = word1.toLowerCase();
        String lword2 = word2.toLowerCase();

        // If lengths are different, they can't be anagrams
        if (lword1.length() != lword2.length()) {
            System.out.println("The given strings are not anagrams.");
            return;
        }

        // Count frequency of characters in both strings
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        //  map1 with the frequency of characters in word1
        for (int i = 0; i < lword1.length(); i++) {
            char ch = lword1.charAt(i);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }

        //  map2 with the frequency of characters in word2
        for (int i = 0; i < lword2.length(); i++) {
            char ch = lword2.charAt(i);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }
        
        //compare map1 and map2
        if (map1.equals(map2)) {
            System.out.println("The words \"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        } else {
            System.out.println("The words \"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
        }
    }
}