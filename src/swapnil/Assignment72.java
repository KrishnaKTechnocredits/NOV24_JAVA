package swapnil;

import java.util.Arrays;

public class Assignment72 {
	
	void shiftZeroToRight(int[] arr) {
		int j =0;
		int[] s = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				s[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(s));;
	}

	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		Assignment72 a = new Assignment72();
		a.shiftZeroToRight(arr);
		

	}

}
