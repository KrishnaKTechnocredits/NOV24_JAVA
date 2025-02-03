package ravindra;

import java.util.Arrays;

public class Assignment_63 {
	public static void main(String[] args) {
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		Assignment_63 assignment=new Assignment_63();
		String [] revrsearray=assignment.reverseArray(input);
		System.out.println(Arrays.toString(revrsearray));
	}

	static String reverseString(String input) {
		String strrev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			strrev += input.charAt(i);
		}
		return strrev.toLowerCase();
	}

	 String[] reverseArray(String [] input) {
		String[] revArray=new String[input.length];
		for(int i=0,j=input.length-1;i<input.length;i++,j--) {
			String str=input[i];
			String revrese=reverseString(str);
			revArray[j] = revrese ;
		}
		return revArray;
	}
}
