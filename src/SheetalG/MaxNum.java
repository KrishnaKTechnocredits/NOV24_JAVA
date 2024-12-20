/*Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22*/

package SheetalG;

import java.util.Arrays;

public class MaxNum {
	
	int maxNum;
	public void printMaxNumber(int [] input) {
		maxNum=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			
			if(input[i]>maxNum) //-44
				maxNum=input[i];
		}
		
		System.out.println("Output : " + maxNum);
	}
	
	public static void main(String[] args) {
		MaxNum maxNumber = new MaxNum();
		int[] input = {44,45,22,25,47,29,46};
		System.out.println("Input : "+ Arrays.toString(input));
		maxNumber.printMaxNumber(input);
		
		int[] inputNum = {-44,-45,-22,-25,-47,-29,-46};
		System.out.println("Input : "+ Arrays.toString(inputNum));
		maxNumber.printMaxNumber(inputNum);
		
	}
}
