package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment62 {
	String getreverseword(String word) {
	String reverseWord="";
	for(int j=word.length()-1;j>=0;j--) {
		reverseWord=reverseWord+word.charAt(j);
	}
	return reverseWord;
}

	String[] reverseArray(String[] input) {
		
		String[] reversedArray=new String[input.length];
	
			for(int i=0;i<input.length;i++) {
		
			reversedArray[i]=getreverseword(input[input.length-1-i]);
			}
			return reversedArray;
	}
	

	public static void main(String[] args) {
		Assignment63 assignment62 = new Assignment63();
		String[] input ={"tech", "aashvi", "Credits", "Ansh"};
        String[] output = assignment62.reverseArray(input);
        System.out.println(Arrays.toString(output));
	}

}
