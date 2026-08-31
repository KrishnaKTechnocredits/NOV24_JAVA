package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment63 {
	String getreverseword(String word) {
	String reverseWord="";
	for(int j=word.length()-1;j>=0;j--) {		
		reverseWord=reverseWord+word.charAt(j);
	}
	return reverseWord.toLowerCase();
}

	String[] reverseArray(String[] input) {
		
		String[] reversedArray=new String[input.length];
	
			for(int i=0;i<input.length;i++) {
		
			reversedArray[i]=getreverseword(input[input.length-1-i]);
			}
			return reversedArray;
	}
	

	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		String[] input ={"TeCh", "Aashvi", "Credits", "AnsH"};
        String[] output = assignment63.reverseArray(input);
        System.out.println(Arrays.toString(output));
	}

}
