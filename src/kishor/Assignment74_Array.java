package kishor;

import java.util.Arrays;

//Rotate all the numbers of an array to the right by one position. 
//input : {10,20,30,40,50}
//output : {50,10,20,30,40};

public class Assignment74_Array {
	
	void RotateArray(int[] input) {
		int[] arr = new int[input.length];
		for(int i=0;i<input.length-1;i++) {
			arr[i+1]=input[i];
			arr[0]=input[input.length-1];
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		int[] input = {10,20,30,40,50};
		Assignment74_Array assignment74 = new Assignment74_Array();
		assignment74.RotateArray(input);
	}
}
