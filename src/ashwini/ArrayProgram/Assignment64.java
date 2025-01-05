package ashwini.ArrayProgram;

import java.util.Arrays;

/*
 Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]

 */
public class Assignment64 {
	String getFirstLetterInUpperCase(String word) {

		/*
		 * word=word.toLowerCase(); char ch=Character.toUpperCase(word.charAt(0));
		 * String output= ch+ word.substring(1); return output; } String
		 * getRevWord(String word) { String output=""; for(int
		 * i=word.length()-1;i>=0;i--) { output += word.charAt(i); } return output;
		 */

		// Simplified way-->
		return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	}

	String getRevWord(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			output += word.charAt(i);
		}
		return output;
	}

	String[] getRevWordRevOrderArraywithFirstLetCap(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			String word = getRevWord(arr[i]);
			output[j] = getFirstLetterInUpperCase(word);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment64 a64 = new Assignment64();
		String[] arr = { "TeCh", "Aashvi", "Credits", "AnsH" };
		String[] revArray = a64.getRevWordRevOrderArraywithFirstLetCap(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(revArray));
	}
}
