package vrushali.arrayProgram;

import java.util.Arrays;

//Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array and place at in reverse order.
//
//input : {"tech", "aashvi", "Credits", "Ansh"}
//output : [hsnA,stiderC, ivhsaa, hAssignment - 65 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array and place at in reverse order.
//
//input : {"Te1ch", "A2as3hvi", "Cre45di555ts", "Ansh"}
//output : [Hsna,Stiderc, Ivhsaa, Hcet]cet]
		
public class ReverseStringAndReverseStringArray {

	String returnReverseString(String str) {
		String temp = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			temp = temp + str.charAt(j);
		}
		return temp;
	}

	void printEachStringInRverseFromArray(String[] str) {

		String[] tempArray = new String[str.length];
		for (int i = 0; i < str.length; i++) {

			tempArray[i] = returnReverseString(str[i]);
		}

		String[] reverseStringArray = reverseStringArray(tempArray);
		System.out.println("Original String Array :--" + Arrays.toString(str));
		System.out.println("Reverse String Array :--" + Arrays.toString(reverseStringArray));
	}

	String[] reverseStringArray(String[] str) {
		String[] reverseArray = new String[str.length];
		for (int i = str.length - 1, k = 0; i >= 0; i--, k++) {

			reverseArray[k] = str[i];
		}
		return reverseArray;
	}

	public static void main(String[] args) {
		ReverseStringAndReverseStringArray reverseStringAndReverseStringArray = new ReverseStringAndReverseStringArray();
		String[] str = { "tech", "aashvi", "Credits", "Ansh" };
		reverseStringAndReverseStringArray.printEachStringInRverseFromArray(str);
	}
}
