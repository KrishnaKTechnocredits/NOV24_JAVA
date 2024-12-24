/*
 * 
 * Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 

 */


package rohan;

public class Assignment_60 {

	public static void main(String[] args) {
		Assignment_60 assignment = new Assignment_60();
		int[] input = {-33,-33,-19,-55,-53,-11};
		int output =assignment.SecondMax(input);
		System.out.println(output);
	}
	int SecondMax(int[] input) {
		int max = input[0];
		int SecMax = input[1];
		for(int i=2;i<input.length;i++) {
			if(input[i]>max) {
				SecMax = max;
				max = input[i];
			}
			else if (input[i]>SecMax){
				SecMax = input[i];
			}
		}
		System.out.println("Output "+max);
		return SecMax;
	}

}
