/*
Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
*/

package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment61 {
	
	String getreverseword(String word) {
		
		String reverseWord="";
		for(int j=word.length()-1;j>=0;j--) {
			reverseWord=reverseWord+word.charAt(j);
		}
		return reverseWord;
	}
	
	String[] reverseArray(String[] input) {
		
		String[] reversedArray=new String[3];
		
		for(int i=0;i<input.length;i++) {
			
			reversedArray[i]=getreverseword(input[i]);
		}
		
		
		return reversedArray;
		
	}
	
	public static void main(String[] args) {
		Assignment61 assignment61=new Assignment61();
		String[] input= {"tech", "aashvi", "credits"};
		String[] output=assignment61.reverseArray(input);
		System.out.println(Arrays.toString(output));
	}

}
