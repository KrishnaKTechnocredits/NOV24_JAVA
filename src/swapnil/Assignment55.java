package swapnil;

import java.util.Arrays;

public class Assignment55 {
	
	int[] unionArray(int[] input,int[] input1) {
		
		int[] Array = new int[input.length + input1.length];
		for (int i=0;i<=input.length-1;i++) {
			Array[i]=input[i];
			if(i==input.length-1) {
				i++;
				for(int j=0;j<=input1.length-1;i++,j++) {
					Array[i]=input1[j];
				}
			}
			  
		}
		return Array;
	}

	public static void main(String[] args) {
		int[] arr = {10,19,18};
		int[] arr1 = {99,8};
		Assignment55 a = new Assignment55();
		int[] Array = a.unionArray(arr, arr1);
		System.out.println(Arrays.toString(Array));
	}

}
