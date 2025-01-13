package kavita;

import java.util.Arrays;

/*Shift all the zeros at the begining of an array.
int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}
Time:7m*/
public class Assignment73 {
	int[] getUpdatedArray(int[] arr) {
		int[] arr1=new int[arr.length];
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
		Assignment73 assignment73=new Assignment73();
		int[] input = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("Input array is: "+Arrays.toString(input));
		int[] ans=assignment73.getUpdatedArray(input);
		System.out.println("Updated array is: "+Arrays.toString(ans));
	}
}
