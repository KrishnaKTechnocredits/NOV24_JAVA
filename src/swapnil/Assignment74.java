package swapnil;

import java.util.Arrays;

public class Assignment74 {
	
	void ShiftToRight(int[] arr) {
		int[] Array = new int[arr.length];
		
		for(int i=0;i<arr.length-1;i++) {
			
			Array[i+1] = arr[i];
			Array[0] = arr[arr.length-1];
		}
		System.out.println(Arrays.toString(Array));
	}

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		Assignment74 a = new Assignment74();
		a.ShiftToRight(arr);
	}

}
