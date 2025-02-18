package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment53 {
	
	void printArrayInReverseOrder(int[] input) {
		System.out.println("Reverse order Array: ");
		int[] output = new int[input.length];
		for(int i=input.length-1;i>=0;i--) {
			output[i]=input[input.length-1-i];
		}System.out.println(Arrays.toString(output));
		
	}

	public static void main(String[] args) {
		Assignment53 assignment53=new Assignment53();
		int[] input={10,34,22,16,19,99};
		assignment53.printArrayInReverseOrder(input);
		

	}

}
