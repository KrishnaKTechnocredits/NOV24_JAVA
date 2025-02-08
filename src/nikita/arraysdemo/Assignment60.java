/* Assignment - 60 : 21st Dec'2024 [20 min] [IMP]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
*/

package nikita.arraysdemo;

import java.util.Arrays;

public class Assignment60 {
	
	void printSecondMaxNumberFromArray(int[] input) 
	{
		int maxNumber = input[0];
		int secondMaxNumber = input[1];
		
		if(maxNumber < secondMaxNumber) {
			maxNumber = input[1];
			secondMaxNumber = input[0];
		}
		
		for(int i = 2; i<input.length; i++) 
		{
			if(maxNumber < input[i]) 
			{
				secondMaxNumber = maxNumber;
				maxNumber = input[i];
			}
			else if(secondMaxNumber < input[i])
			{
				secondMaxNumber = input[i];
			}
		}
		System.out.println(Arrays.toString(input));
		System.out.println(secondMaxNumber);
	}
	public static void main(String[] args) {
		int[] input = {33,33,19,55,53,11};
		Assignment60 a60 = new Assignment60();
		a60.printSecondMaxNumberFromArray(input);
	}
}
