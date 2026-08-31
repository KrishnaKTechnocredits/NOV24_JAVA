/*Count Vowels in a String
📥 Input: aaryahi
📊 Total vowel count: 4
🅰️ a → 3
ℹ️ i → 1
🔢 Unique vowels: 2

💡 Hint: Use switch-case and a Scanner class for input handling.*/

package sindhu.assignment102to107;

import java.util.*;

public class Assignment107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input String: ");
        String word = sc.next();  // Take input from user
        int totalVowelCount = 0;
        
        // HashMap to store the frequency of each vowel
        Map<Character, Integer> vowelCount = new HashMap<>();
        
        // Loop through each character in the string
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);  // Get character at index i

            // Switch to check if the character is a vowel
            switch (Character.toLowerCase(ch)) {  // Convert to lowercase for case-insensitivity
                case 'a':
                    if (vowelCount.containsKey('a')) {
                        vowelCount.put('a', vowelCount.get('a') + 1);
                    } else {
                        vowelCount.put('a', 1);
                    }
                    totalVowelCount++;
                    break;
                case 'e':
                    if (vowelCount.containsKey('e')) {
                        vowelCount.put('e', vowelCount.get('e') + 1);
                    } else {
                        vowelCount.put('e', 1);
                    }
                    totalVowelCount++;
                    break;
                case 'i':
                    if (vowelCount.containsKey('i')) {
                        vowelCount.put('i', vowelCount.get('i') + 1);
                    } else {
                        vowelCount.put('i', 1);
                    }
                    totalVowelCount++;
                    break;
                case 'o':
                    if (vowelCount.containsKey('o')) {
                        vowelCount.put('o', vowelCount.get('o') + 1);
                    } else {
                        vowelCount.put('o', 1);
                    }
                    totalVowelCount++;
                    break;
                case 'u':
                    if (vowelCount.containsKey('u')) {
                        vowelCount.put('u', vowelCount.get('u') + 1);
                    } else {
                        vowelCount.put('u', 1);
                    }
                    totalVowelCount++;
                    break;
                default:
                    break;  // Ignore non-vowel characters
            }
        }

        // Output the results
        System.out.println("Total vowel count: " + totalVowelCount);
        
        // Display the count of each unique vowel
        for (char key : vowelCount.keySet()) {
            System.out.println(key + " -> " + vowelCount.get(key));
        }
        
        // Display the number of unique vowels
        System.out.println("Unique vowels: " + vowelCount.size());
        
        sc.close();
    }
}