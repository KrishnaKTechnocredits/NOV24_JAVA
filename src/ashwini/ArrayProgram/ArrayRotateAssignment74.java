package ashwini.ArrayProgram;

import java.util.Arrays;
/*
 Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}
 */
public class ArrayRotateAssignment74 {
	
    int [] arrayRotate(int[] arr) {
    	int[] output =new int[arr.length];
    	output[0]=arr[arr.length-1];
    	output[1]=arr[0];
       	for(int i=1;i<arr.length;i++) {
    		output[i] = arr[i-1];	
    	}
       	return output;
    }
	public static void main(String[] args) {
		ArrayRotateAssignment74 a74=new ArrayRotateAssignment74();
	
		int[] arr= {10,20,30,40,50};
		int output[] =a74.arrayRotate(arr);
		System.out.println(Arrays.toString(output));
		int output1[] =a74.arrayRotate(output);
		System.out.println(Arrays.toString(output1));

	}

}
