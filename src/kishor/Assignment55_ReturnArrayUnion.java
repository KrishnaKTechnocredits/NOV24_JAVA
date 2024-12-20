package kishor;

import java.util.Arrays;

//return union of given two array.

public class Assignment55_ReturnArrayUnion {
	
	int[] getUnionArray(int arr1[],int arr2[]) {
		int[] obj = new int[arr1.length+arr2.length];
		int count=0;
		
		for(int i=0;i<arr1.length;i++,count++) {
			obj[count]=arr1[i];
		}
		for(int k=0;k<arr2.length;k++,count++) {
			obj[count]=arr2[k];
		}
		return obj;
	}
	
	public static void main(String[] args) {
		int[] arr1 ={10,19,18};
		int[] arr2 ={99,8};
		
		Assignment55_ReturnArrayUnion assignment55 = new Assignment55_ReturnArrayUnion();
		int[] ans=assignment55.getUnionArray(arr1, arr2);
		System.out.println(Arrays.toString(ans));
		
	}
}
