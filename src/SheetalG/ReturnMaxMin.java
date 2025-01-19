/*Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.
int[] input={44,45,22,25,47,29,46};
int getMaxMinNum(int[] arr){
	
} */

package SheetalG;

import java.util.Arrays;

public class ReturnMaxMin {
	
	int[] getMaxMin(int [] input) {
		int maxNum=Integer.MIN_VALUE;
		int minNum = Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			if(input[i]>maxNum)
				maxNum=input[i];
			else if(input[i]<minNum)
				minNum=input[i];
		}
		return new int[] { maxNum, minNum };
	}
	
	void printMaxMin(int[] input) {
		int[] output = getMaxMin(input); 
		System.out.println("Output : "+output[0]);
		System.out.println("Output : "+output[1]);
	}
	
	public static void main(String[] args) {
		ReturnMaxMin returnMaxMin = new ReturnMaxMin();
		int[] input={44,45,22,25,47,29,46};
		System.out.println("Input : "+ Arrays.toString(input));
		returnMaxMin.printMaxMin(input);
		
	}

}
