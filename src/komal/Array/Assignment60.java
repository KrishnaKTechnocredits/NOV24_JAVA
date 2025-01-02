//
//Assignment - 60 : 21st Dec'2024 [20 min]  -----[my time 20min]
//return second maximum number from given array.
//
//input = {33,33,19,55,53,11};
//output : 53 
package komal.Array;

public class Assignment60 {

	int getSecconfMaxNumber(int[] input) {
		int maxNum = input[0];
		int secondmax = input[1];

		if (secondmax > maxNum) {
			secondmax = input[0];
			maxNum = input[1];
		}
		for (int i = 2; i < input.length; i++) {
			if (maxNum < input[i]) {
				secondmax = maxNum;
				maxNum = input[i];
			} else if (secondmax < input[i]) {
				secondmax = input[i];
			}
		}
		return secondmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 33, 33, 19, 55, 53, 11 };
		Assignment60 a60 = new Assignment60();
		int secondMaxNum = a60.getSecconfMaxNumber(input);
		System.out.println("secondMaxNum =>" + secondMaxNum);
//		System.out.println(Assignment61.name);
	}

}
