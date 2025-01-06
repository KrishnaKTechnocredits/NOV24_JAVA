/*
Assignment - 73 : 6th Jan'2024 10 mins

Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}
*/

package pramod.arraydemo;
import java.util.*;
class Assignment73{

	void printAllZeroAtStartOfArray(int[] arr){
		int[] output = new int[arr.length];
		int arrLength = arr.length-1;
		int countOfI = 0;
		for (int i=0; i< arr.length; i++){
			if(arr[i]!=0){
				output[arrLength]=arr[i];
				arrLength--;
			}
			else {
				arr[countOfI]=arr[i];
				countOfI++;
			}
		}
		System.out.println("All zero at the start of Array : "+ Arrays.toString(output));
	}

	public static void main(String[] args){
		Assignment73 A73=new Assignment73();
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("Given array is : "+ Arrays.toString(arr));
		A73.printAllZeroAtStartOfArray(arr);
	}
}