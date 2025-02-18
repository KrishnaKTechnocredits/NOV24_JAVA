package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment54 {
	
	int[] printArrayInReverseOrder(int[] input) {
		System.out.println("Reverse order Array: ");
		int[] output = new int[input.length];
		for(int i=input.length-1;i>=0;i--) {
			output[i]=input[input.length-1-i];
		}return output;
		
	}

	public static void main(String[] args) {
		Assignment54 assignment54=new Assignment54();
		int[] input={10,34,22,16,19,99};
		System.out.println(Arrays.toString(assignment54.printArrayInReverseOrder(input)));
		

	}

}