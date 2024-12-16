package kishor;

//return the Maximum number from given array.
public class Assignment49_ArrayReturn {

	int getMaxNumber(int[] input) {
		int MaxNum = input[0]; // [0th] index is base for comparing
		// taking directly first as we taken base reference to input[0] index value
		for (int i = 1; i < input.length; i++) {
			if (MaxNum < input[i]) {
				MaxNum = input[i];
			}
		}
		return MaxNum;
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr1 = { -44, -45, -22, -25, -47, -29, -46 };
		Assignment49_ArrayReturn assignment49 = new Assignment49_ArrayReturn();
		int ans = assignment49.getMaxNumber(arr);
		System.out.println("The max number in given array is:-" + ans);

		int ans1 = assignment49.getMaxNumber(arr1);
		System.out.println("The max number in given array is:- " + ans1);
	}
}
