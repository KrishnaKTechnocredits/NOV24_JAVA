package pranita;

import java.util.Arrays;


public class Assignment72 {
	
	int[] getNewOrderArray(int[] arr) {
		int[] newOrderArray = new int[arr.length];
		int nonZeroValueCount = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newOrderArray[nonZeroValueCount] = arr[i];
				nonZeroValueCount++;
			}
			
		}
		return newOrderArray;
	}

	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println(Arrays.toString(new Assignment72().getNewOrderArray(arr)));
	}
}
