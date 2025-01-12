/*Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47*/

package SheetalG;

import java.util.Arrays;

public class MinNumber {
	
	int minNum;
	
	void printMinNumber(int[] input) {
		minNum=Integer.MAX_VALUE;
		for(int i=0;i<input.length;i++){
			if(input[i]<minNum) {
				minNum=input[i];
			}
		}
		System.out.println("Output : "+minNum);
	}
	
	public static void main(String[] args) {
		MinNumber minNumber = new MinNumber();
		int[] input ={44,45,22,25,47,29,46};
		System.out.println("Input : "+Arrays.toString(input));
		minNumber.printMinNumber(input);
		int[] inputNum = {-44,-45,-22,-25,-47,29,46};
		System.out.println("Input : "+Arrays.toString(inputNum));
		minNumber.printMinNumber(inputNum);
	}

}
