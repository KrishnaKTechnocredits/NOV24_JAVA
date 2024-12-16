//
//Assignment - 51 : 16th Dec'2024 [15 mins]
//
//print maximum and minimum number from given array. 
//
//void findMaxMin(int[] arr){
//	int maxNum=arr[0], minNum=arr[0];
//} 

package komal.Array;

public class Assignment51 {

	void getMaxMinNum(int[] input) {

		int maxNum = input[0], minNum = input[0];

		for (int i = 1; i < input.length; i++) {

			if (maxNum < input[i]) {
				maxNum = input[i];
			}

			if (minNum > input[i]) {
				minNum = input[i];
			}
		}

		System.out.println("Maximum Number : " + maxNum);
		System.out.println("Minimum Number : " + minNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		Assignment51 a51 = new Assignment51();
		a51.getMaxMinNum(input);
	}

}
