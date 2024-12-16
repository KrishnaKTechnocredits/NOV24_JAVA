//Assignment - 52 : 16th Dec'2024 [15 mins]
//
//return maximum and minimum number from given array.
//
//int getMaxMinNum(int[] arr){
//	
//} 

package komal.Array;

public class Assignment52 {
	int[] getMaxMinNum(int[] input) {
		int maxNum = input[0], minNum = input[0];
		int[] output = new int[2];
		for (int i = 1; i < input.length; i++) {
			if (maxNum < input[i]) {
				maxNum = input[i];
			}

			if (minNum > input[i]) {
				minNum = input[i];
			}
		}
		output[0] = maxNum;
		output[1] = minNum;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		Assignment52 a52 = new Assignment52();
		int[] output = a52.getMaxMinNum(input);
		System.out.println("Maximum Number is => " + output[0]);
		System.out.println("Minimum Number is => " + output[1]);
	}
}
