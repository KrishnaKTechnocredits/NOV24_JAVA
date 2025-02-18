package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment65 {
	String getreverseword(String word) {
	String reverseWord="";
	for(int j=word.length()-1;j>=0;j--) {
		char ch=word.charAt(j);
		boolean flag=Character.isDigit(ch);
		if(flag==false) {
		reverseWord=reverseWord+ch;
		}
		}
	return reverseWord.substring(0,1).toUpperCase()+reverseWord.substring(1,reverseWord.length()-1) + reverseWord.substring(reverseWord.length()-1).toLowerCase();
}

	String[] reverseArray(String[] input) {
		
		String[] reversedArray=new String[input.length];
	
			for(int i=0;i<input.length;i++) {
		
			reversedArray[i]=getreverseword(input[input.length-1-i]);
			}
			return reversedArray;
	}
	

	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();
		String[] input ={"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
        String[] output = assignment65.reverseArray(input);
        System.out.println(Arrays.toString(output));
	}
}
     