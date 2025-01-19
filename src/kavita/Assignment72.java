package kavita;

import java.util.Arrays;

/*Shift all the zeros at the end of an array.
int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}
Time: 5m*/
public class Assignment72 {
	int[] getUpdatedArray(int[] arr) {
		int[] obj=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				obj[j]=arr[i];
				j++;
			}
		}return obj;
	}
	
	public static void main(String[] args) {
		Assignment72 assignment72=new Assignment72();
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		int[] ans=assignment72.getUpdatedArray(arr);
		System.out.println("New Array is: "+Arrays.toString(ans));
	}
}
