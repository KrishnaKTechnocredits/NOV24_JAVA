package swapnil;

import java.util.Arrays;

public class Assignment74 {

	int[] ShiftToRight(int[] arr) {
		
		int temp = arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];	
		}
		arr[0]=temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		Assignment74 a = new Assignment74();
		System.out.println(Arrays.toString(arr));
		int[] A=a.ShiftToRight(arr);
		System.out.println(Arrays.toString(A));
		
	
		
	}

}
//Int temp = arr[arr.length-1];
//For(int I =arr.length -1;I>0;I--)
//{
// arr(I) = arr(i-1);
//}
//arr(0)= temp;