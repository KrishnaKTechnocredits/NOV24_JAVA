package roshan.IMpNumberlogic;

import java.util.Arrays;

public class Anagram105 {

	void checkForAnagram(String str1, String str2) {
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		char[] s1chaArray = s1.toCharArray();
		char[] s2chaArray = s2.toCharArray();
		Arrays.sort(s1chaArray);
		Arrays.sort(s2chaArray);

		if (Arrays.equals(s1chaArray, s2chaArray)) {
			System.out.println(str1 + "," + str2 + " is Anagram String");
		} else {
			System.out.println(str1 + "," + str2 + " is not Anagram String");

		}

	}

	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";
		Anagram105 anagram105 = new Anagram105();
		anagram105.checkForAnagram(str1, str2);
		anagram105.checkForAnagram("Techno", "chnott");

	}
}

/*
 * Assignment 105: Check if anagram: 🔹 Assignment 105: Check for Anagram 📥
 * Input: Listen, Silent ✅ The given strings are anagram 📥 Input: Techno,
 * chnott ❌ The given strings are not anagrams 💡 Hint: Use sorting and
 * comparison of character arrays
 * 
 * 
 *    ______________________USING MAP____________________________________
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class AnagramCheck { 
 * void checkForAnagram(String str1, String str2) {
 * String s1 = str1.toLowerCase(); 
 * String s2 = str2.toLowerCase();
 * 
 * // Quick length check 
 * if (s1.length() != s2.length()) {
 * System.out.println(str1 + ", " + str2 + " is not Anagram String"); return; }
 * 
 * // Count characters in first string 
 * Map<Character, Integer> map = new HashMap<>(); 
 * for (char c : s1.toCharArray()) { 
 * map.put(c, map.getOrDefault(c,0) + 1); }
 * 
 * // Subtract counts using second string 
 * for (char c : s2.toCharArray()) { 
 * if(!map.containsKey(c)) { 
 * System.out.println(str1 + ", " + str2 +" is not Anagram String"); 
 * return; 
 * }
map.put(c, map.get(c) - 1); 
if(map.get(c) == 0) 
{ map.remove(c); 
  } 
 }
 * 
 * // If map is empty, they are anagrams if (map.isEmpty()) {
 * System.out.println(str1 + ", " + str2 + " is Anagram String"); 
 * } 
 * else {
 * System.out.println(str1 + ", " + str2 + " is not Anagram String"); } }
 * 
 * public static void main(String[] args)
 *  { 
 *  AnagramCheck ac = new
 * AnagramCheck(); ac.checkForAnagram("Listen", "Silent");
 * ac.checkForAnagram("Hello", "World"); } }
 * 
 */