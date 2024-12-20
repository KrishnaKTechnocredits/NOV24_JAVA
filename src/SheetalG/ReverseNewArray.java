/*Assignment - 54 : 18th Dec'2024 [20 mins]
return the array having elements in reverse order of original array.

int[] getReverseArray(int[] arr){
	
} void printArrayInRevOrder(int[] input){
	for(int i=input.length-1,j=0;i>=0;i--,j++){
		output[j] = input[i];
	}
}*/

package SheetalG;

import java.util.Arrays;

public class ReverseNewArray {
	
	int[] getReverseArray(int[] input) {
		int[] newInput = new int[input.length];
		int j=0;
		for(int i=input.length-1;i>=0;i--) {
			newInput[j]=input[i];
			j++;
		}
		return newInput;
	}
	
	void printReverseArray(int[] input) {
		int[] output =getReverseArray(input);
		System.out.println("Output : "+Arrays.toString(output));
	}
	public static void main(String[] args) {
		ReverseNewArray reverseArray =new ReverseNewArray();
		int[] input = {10,34,22,16,19,99};
		System.out.println("Input : "+Arrays.toString(input));
		reverseArray.printReverseArray(input);
		
	}

}
