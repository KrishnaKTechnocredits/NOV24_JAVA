package kishor;
//return second maximum number from given array.

//input = {33,33,19,55,53,11};

public class Assignment60_SecondMaxNumber {

	int getSecondMaxNumber(int[] input) {
		int maxNum = input[0];
		int secondMax = input[1];
		if (input[1] > input[0]) {
			maxNum = input[1];
			secondMax = input[0];
		}
		// input[0] and input[1] is sorted thats why start with 2nd index
		for (int i = 2; i < input.length; i++) {
			if (input[i] > maxNum) {
				secondMax = maxNum;
				maxNum = input[i];
			} else if (input[i] > secondMax) {
				secondMax = input[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr = { 33, 33, 19, 55, 53, 11 };
		Assignment60_SecondMaxNumber assignment60 = new Assignment60_SecondMaxNumber();
		int ans = assignment60.getSecondMaxNumber(arr);
		System.out.println("The second max number in given array is:- " + ans);
	}

}
