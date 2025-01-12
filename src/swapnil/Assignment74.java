package swapnil;

import java.util.Arrays;

public class Assignment74 {

	int[] ShiftToRight(int[] arr) {
		int[] Array = new int[arr.length];
		Array[0] = arr[arr.length-1];
			
		for(int i=0;i<arr.length-1;i++) {
			Array[i+1] = arr[i];
	
		}
		return Array;
		
	}

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		Assignment74 a = new Assignment74();
		System.out.println(Arrays.toString(arr));
		int[] A=a.ShiftToRight(arr);
		System.out.println(Arrays.toString(A));
		
		int[] B=a.ShiftToRight(A);
		System.out.println(Arrays.toString(B));
		
	}

}