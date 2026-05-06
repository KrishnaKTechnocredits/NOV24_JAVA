package swapnilArray;

import java.util.Arrays;

public class Assignment54 {
	
	int[] getRevArray(int[] input) {
		int[] revinput = new int[input.length];
		for(int i=input.length-1,j=0;i>=0;i--,j++) {
			revinput[j] = input[i];
		}	
		return revinput;
		
	}

	public static void main(String[] args) {
		Assignment54 a = new Assignment54();
		int[] input = { 10, 34, 22, 16, 19, 99 };
		int[] Array = a.getRevArray(input);
		System.out.println(Arrays.toString(Array));
		
	}

}
