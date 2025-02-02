/*Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}*/

package sindhu.Array;

import java.util.Arrays;

public class Assignment73 {
	
	public int[] getNewArray0AtLast(int [] arr) {
		int[] newArr = new int[arr.length];
		int j = 4;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				newArr[j]=arr[i];
				j++;
			}
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("The input array:"+ Arrays.toString(arr));
		Assignment72 assign72 = new Assignment72();
		int[] newArr = assign72.getNewArray0AtLast(arr);
		System.out.println("The output array:"+ Arrays.toString(newArr));
	}
}
