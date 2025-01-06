/*
Assignment - 72 : 6th Jan'2024 13 mins

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}
*/

package pramod.arraydemo;
import java.util.*;
class Assignment72 {

	void printAllZeroAtEnd(int[] arr){
		int arrLength = arr.length-1;
		int[] output = new int[arr.length];
		int countOfI=0;
		for(int i = 0 ; i<arr.length; i++){
			int num = arr[i];
			if(num!=0){
				output[countOfI]=arr[i];
				countOfI++;
			}
			else{
			output[arrLength]=arr[i];
			arrLength--;
			}
		}
		System.out.println("Zero at the end : "+ Arrays.toString(output));
	}

	public static void main(String[] args){
		Assignment72 A72= new Assignment72();
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("Given array is : "+ Arrays.toString(arr));
		A72.printAllZeroAtEnd(arr);
	
	}

}