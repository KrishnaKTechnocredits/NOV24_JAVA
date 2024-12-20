/*Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array. 
int[] input={44,45,22,25,47,29,46};
void findMaxMin(int[] arr){
	int maxNum=arr[0], minNum=arr[0];
} 
*/

package SheetalG;

import java.util.Arrays;

public class MaxMinNumber {
	
	int maxNum=Integer.MIN_VALUE;
	int minNum=Integer.MAX_VALUE;
	void printMaxMin(int [] input) {
		for(int i=0;i<input.length;i++) {
			if(input[i]<minNum)
				minNum=input[i];
			else if(input[i]>maxNum)
				maxNum=input[i];
		}
		System.out.println("Maximum Number : " + maxNum);
		System.out.println("Minimum Number : " + minNum);
	}

	public static void main(String[] args) {
		MaxMinNumber maxMinNumber = new MaxMinNumber();
		int[] input={44,45,22,25,47,29,46};
		System.out.println("Input : "+Arrays.toString(input));
		maxMinNumber.printMaxMin(input);
	}
}
