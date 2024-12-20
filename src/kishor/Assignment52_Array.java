package kishor;
//return maximum and minimum number from given array.

public class Assignment52_Array {

	int[] getMaxMinNumber(int[] input) {
		int[] object = new int[2]; // this we will return
		int MaxNum = input[0];
		int MinNum = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > MaxNum) {
				MaxNum = input[i];
			}
			if (input[i] < MinNum) {
				MinNum = input[i];
			}
		}
		object[0] = MaxNum;
		object[1] = MinNum;
		return object;
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 107, 46 };
		Assignment52_Array assignment52 = new Assignment52_Array();
		int[] ans = assignment52.getMaxMinNumber(arr);
		System.out.println("The maximum number in given string is:- " + ans[0]);
		System.out.println("The minimum number in given string is:- " + ans[1]);
	}
}
