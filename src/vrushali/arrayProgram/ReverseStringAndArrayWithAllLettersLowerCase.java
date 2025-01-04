package vrushali.arrayProgram;
//Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
//reverse each string in array and place at in reverse order.
//
//input : {"TeCh", "Aashvi", "Credits", "AnsH"}
//output : [hsna,stiderC, ivhsaa, hcet]

import java.util.Arrays;

public class ReverseStringAndArrayWithAllLettersLowerCase {
	
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
		
		String[] lowerCaseArray=returnStringArrayWithAllLowercaseLetters(reverseStringArray);
		System.out.println("Array with all letter with lower case :--"+Arrays.toString(lowerCaseArray));
	}

	String[] reverseStringArray(String[] str) {
		String[] reverseArray = new String[str.length];
		for (int i = str.length - 1, k = 0; i >= 0; i--, k++) {

			reverseArray[k] = str[i];
		}
		return reverseArray;
	}
	String[] returnStringArrayWithAllLowercaseLetters(String[] str)
	{
		String[] lowerCaseArray=new String [str.length];
		String tempString="";
		for(int i=0;i<str.length;i++)
		{
			tempString=str[i].toLowerCase();
			lowerCaseArray[i]=tempString;
		}
		
		return lowerCaseArray;
		
	}

	public static void main(String[] args) {
		ReverseStringAndArrayWithAllLettersLowerCase reverseStringAndArrayWithAllLettersLowerCase = new ReverseStringAndArrayWithAllLettersLowerCase();
		String[] str = { "tech", "aashvi", "Credits", "Ansh" };
		reverseStringAndArrayWithAllLettersLowerCase.printEachStringInRverseFromArray(str);
	}
	

}
