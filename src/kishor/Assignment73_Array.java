package kishor;

import java.util.Arrays;

//Shift all the zeros at the begining of an array.
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {0,0,0,0,5,22,44,55,12,19}

public class Assignment73_Array {
	
	int[] getUpdatedArray(int[] arr) {
		int[] arr1 = new int[arr.length];
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>0) {
				arr1[j]=arr[i];
				j--;
			}
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		Assignment73_Array assignment73 = new Assignment73_Array();
		int[] updatedarray=assignment73.getUpdatedArray(arr);
		System.out.println(Arrays.toString(updatedarray));
	}

}
