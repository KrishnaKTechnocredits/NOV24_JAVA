package pooja.array;
/*
 Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
 */

public class Assignment_49 {
	 
 int getMaxNumber(int[] input) {
	 int maxNumber =0;
		for(int i = 1;i<input.length;i++) {
			maxNumber = input[i];
			for(int j=1;j<input.length;j++) {
				if(maxNumber<input[j]) {
					maxNumber = input[j];
				}
			}
		}
		return maxNumber;
	}
	public static void main(String[] args) {
		int[] input = {44,45,22,25,47,29,46};
		int[] input2 = {-44,-45,-22,-25,-47,-29,-46};
		Assignment_49 assignment_49 = new Assignment_49();
		System.out.println("Maximum number from given array is : " + assignment_49.getMaxNumber(input));
		System.out.println("Maximum number from given array is : " + assignment_49.getMaxNumber(input2));
	}
}