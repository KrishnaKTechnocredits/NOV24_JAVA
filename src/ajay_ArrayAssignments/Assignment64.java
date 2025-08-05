package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment64 {
	String getreverseword(String word) {
	String reverseWord="";
	for(int j=word.length()-1;j>=0;j--) {
		reverseWord=reverseWord+word.charAt(j);
		}
	return reverseWord.substring(0,1).toUpperCase() + reverseWord.substring(1).toLowerCase();
}

	String[] reverseArray(String[] input) {
		
		String[] reversedArray=new String[input.length];
	
			for(int i=0;i<input.length;i++) {
		
			reversedArray[i]=getreverseword(input[input.length-1-i]);
			}
			return reversedArray;
	}
	

	public static void main(String[] args) {
		Assignment65 assignment64 = new Assignment65();
		String[] input ={"Tech", "Aashvi", "Credits", "Ansh"};
        String[] output = assignment64.reverseArray(input);
        System.out.println(Arrays.toString(output));
	}
}
     