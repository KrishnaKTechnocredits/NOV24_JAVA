//Assignment - 72 : 6th Jan'2024
//
//Shift all the zeros at the end of an array.
//
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {5,22,44,55,12,19,0,0,0,0}


package fazrana.array;

import java.util.Arrays;

public class FAssignment72 {
	int[] getZeroAtEnd(int[] array) {
		int[] array1= new int[array.length];
		for (int i=0,j=0;i<array.length;i++) {
			if(array[i]!=0) {
				array1[j]=array[i];
				j++;
			}
		}
		return array1;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("Input: "+Arrays.toString(arr));
		FAssignment72 fassignment72=new FAssignment72();
		System.out.println("Output array: "+Arrays.toString(fassignment72.getZeroAtEnd(arr)));
	}
}
