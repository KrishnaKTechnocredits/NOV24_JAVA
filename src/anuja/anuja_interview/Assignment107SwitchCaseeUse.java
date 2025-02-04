package anuja.anuja_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//🔹 Assignment 107: Count Vowels in a String
//📥 Input: aaryahi
//📊 Total vowel count: 4
//🅰️ a → 3
//ℹ️ i → 1
//🔢 Unique vowels: 2

//💡Hint:Use switch-case and a Scanner class for input handling.

public class Assignment107SwitchCaseeUse {

    public static void main(String[] args) {
        Assignment107SwitchCaseeUse obj = new Assignment107SwitchCaseeUse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count vowels:");
        String str = sc.nextLine().toLowerCase().trim(); // Convert to lowercase and trim
        System.out.println("Input String is: " + str);
        obj.useSwitchCaseToCountVowels(str);
    }

    private void useSwitchCaseToCountVowels(String str) {
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0; // Keep track of vowel counts
        int uniqueVowelsCount = 0; // Variable to count unique vowels

        // Count each vowel's occurrence using switch-case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
        }

        // Print frequency of each vowel if it appears
        System.out.println("Frequency of each vowel in the string:");
        if (countA > 0) {
            System.out.println("a -> " + countA);
        }
        if (countE > 0) {
            System.out.println("e -> " + countE);
        }
        if (countI > 0) {
            System.out.println("i -> " + countI);
        }
        if (countO > 0) {
            System.out.println("o -> " + countO);
        }
        if (countU > 0) {
            System.out.println("u -> " + countU);
        }

        // Print total vowel count if any present
        int vowelCount = countA + countE + countI + countO + countU;
        System.out.println("Total Vowel Count: " + vowelCount);
        
        //work on frequency now
        Map<Character , Integer> mapOfFreq = new HashMap<Character , Integer>();
        for(char ch :  str.toCharArray()) {
        	
        if(mapOfFreq.containsKey(ch)) {
        	mapOfFreq.put(ch, mapOfFreq.get(ch)+1);
        }else {
        	mapOfFreq.put(ch , 1);
        }
// to print the map
       
    }
        for (Map.Entry<Character, Integer> entry : mapOfFreq.entrySet()){
        	System.out.println(entry.getKey()+" ---> "+entry.getValue());
        }
}
}
