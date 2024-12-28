package anuja.array1;

import java.util.Arrays;

/*reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]*/
public class Assignment66_imp {
	//main method
	public static void main(String[] args) {
		Assignment66_imp assignment66_imp = new Assignment66_imp();
		String[] names = {"tech", "aa1shvi", "credits", "H4i", "Hello"};
		System.out.println("Input array is: \n " +Arrays.toString(names));
		System.out.println("--------------------------------------------------");
		String[] expectedOp = {"hcet, aashvi, stiderc, Hi, olleH"};
		System.out.println("Expected Output array is: \n " +Arrays.toString(expectedOp));
		System.out.println("--------------------------------------------------");
		String[] result = assignment66_imp.arraywithNodigitandStringReverse(names);
		System.out.println("Output array is: \n " +Arrays.toString(result));

	}
	//method to remove digits
	String removeDigitsFromString(String name) {
		String word = "";
		for(int i = 0  ; i< name.length() ; i++) {
			//if character is not present then only add
			if(!Character.isDigit(name.charAt(i))) {
				word += name.charAt(i);
			}
		}
		return word;
	}
	//method to reverse string digits
	String reverseWordFromString(String name) {
		String word = "";
		for(int i = name.length()-1 ; i>=0 ; i--) {
			word +=name.charAt(i);
		}
		return word;
	}
	//method to check if digit is there or not ina given string.
	boolean isWordHavingDigit(String name){
		boolean flag = false;
		for(int i = 0 ; i<name.length() ; i++) {
			if(Character.isDigit(name.charAt(i))) {
				flag = true;
				break;
			}
		}
		return flag ;
	}
	//method to create new array with same index of input array
	
	String[] arraywithNodigitandStringReverse(String[] names) {
		String[] output = new String[names.length];
		for(int index = 0, j=0 ; index<names.length ; index++ ,j++) {
			String word = names[index];
			//check if digit is there then do not reverse it
			if(isWordHavingDigit(word)) {
				word = removeDigitsFromString(word);
			}
			else {
				word = reverseWordFromString(word);
			}
			output[j] = word;
		}
		return output ; 
	}
}
	
	