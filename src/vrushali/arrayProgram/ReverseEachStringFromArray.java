package vrushali.arrayProgram;

import java.util.Arrays;

//Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array at the same place.
//
//input : {"tech", "aashvi", "credits"}
//output : [hcet, ivhsaa, stiderc]

public class ReverseEachStringFromArray {
	String returnReverseString(String str) {
		String temp = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			temp = temp + str.charAt(j);
		}
		return temp;
	}

	void printEachStringInRverseFromArray(String[] str) {
		String[] reverseStrArry = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			reverseStrArry[i] = returnReverseString(str[i]);
		}
		System.out.println("Original String Array :--" + Arrays.toString(str));
		System.out.println("Reverse String Array :--" + Arrays.toString(reverseStrArry));
	}

	public static void main(String[] args) {
		ReverseEachStringFromArray reverseEachStringFromArray = new ReverseEachStringFromArray();
		String[] str = { "tech", "aashvi", "credits" };
		reverseEachStringFromArray.printEachStringInRverseFromArray(str);
	}
}
