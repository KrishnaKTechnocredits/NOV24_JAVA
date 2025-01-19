package vrushali.arrayProgram;
//Assignment - 65 : 22nd Dec'2024 [20 min]
//reverse each string in array and place at in reverse order.
//
//input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
//output : [HSNa,StidErc, IvHsaa, HCet]
//
//Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits


import java.util.Arrays;

public class ReverseStringWithSpecificFormat {
	String formatStringWithSpecificOrderAndReverse(String str)
	{
		String word="";
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			if(!Character.isDigit(str.charAt(i)))
			{
				reverseStr = reverseStr + str.charAt(i);
			}
		}
		word=Character.toUpperCase(reverseStr.charAt(0))+reverseStr.substring(1, reverseStr.length()-1)+Character.toUpperCase(reverseStr.charAt(reverseStr.length()-1));
		return word;
	}
	
	String[] reverseStringArray(String[] strArray) {
		String[] reverseArray = new String[strArray.length];
		for (int j = strArray.length - 1, i = 0; j >= 0; j--, i++) {
			reverseArray[i] = strArray[j];
		}
		return reverseArray;
	}
	
	void reverseStringAndArray(String[] str) {
		String[] tempArray = new String[str.length];
		for (int i = 0; i < str.length; i++) {

			tempArray[i] = formatStringWithSpecificOrderAndReverse(str[i]);
		}

		String[] reverseStringArray = reverseStringArray(tempArray);
		System.out.println("Original String Array :--" + Arrays.toString(str));
		System.out.println("Reverse String Array With Specific Format :--" + Arrays.toString(reverseStringArray));

//		String[] lowerCaseArray = stringArrayWithFirstLetterCapital(reverseStringArray);
//		System.out.println("Array with all letter with First letter capital and other lower case :--"
//				+ Arrays.toString(lowerCaseArray));
	}
	
	public static void main(String[] args) {
		ReverseStringWithSpecificFormat reverseStringWithSpecificFormat=new ReverseStringWithSpecificFormat();
		
		String[] strArray={"Te1ch","A2as3Hvi","CrE45di555ts","ANSH"};
		reverseStringWithSpecificFormat.reverseStringAndArray(strArray);
		
	}

}
