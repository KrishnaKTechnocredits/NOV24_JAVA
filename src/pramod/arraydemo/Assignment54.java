/*
Assignment - 54 : 18th Dec'2024 [20 mins] [15 mins]
return the array having elements in reverse order of original array.

int[] getReverseArray(int[] arr){
	
} 
*/

package pramod.arraydemo;
import java.util.Arrays;
class Assignment54 {

	int[] getReverseArray(int[] input) {
		int[] output = new int[input.length];
		for(int i=0,j=input.length-1 ; i<input.length ; i++,j--) {
			output[j]=input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment54 A54=new Assignment54();
		int[] input = {10,5,50,40,60};
		int[] output = A54.getReverseArray(input);
		System.out.print("Given array is: ");
		System.out.println(Arrays.toString(input));
		System.out.println("Reverse Array is as belwo: ");
		for(int i=0; i<output.length;i++) {
			System.out.print(output[i]+" ");
		}
	}
}