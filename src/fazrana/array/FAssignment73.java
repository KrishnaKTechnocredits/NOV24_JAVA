//Assignment - 73 : 6th Jan'2024
//
//Shift all the zeros at the begining of an array.
//
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {0,0,0,0,5,22,44,55,12,19}

package fazrana.array;

import java.util.Arrays;

public class FAssignment73 {
	int[] getZeroAtEnd(int[] array) {
		int[] array1= new int[array.length];
		for (int i=array.length-1,j=array.length-1;i>=0;i--) {
			if(array[i]!=0) {
				array1[j]=array[i];
				j--;
			}
		}
		return array1;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("Input: "+Arrays.toString(arr));
		FAssignment73 fassignment73=new FAssignment73();
		System.out.println("Output array: "+Arrays.toString(fassignment73.getZeroAtEnd(arr)));
	}
}
