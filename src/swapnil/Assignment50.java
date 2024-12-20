package swapnil;

public class Assignment50 {

	int minNum(int[] input) {
		int minNum = input[0];
		for (int i = 0; i < input.length - 1; i++) {
			if (minNum > input[i]) {
				minNum = input[i];
			}
		}
		return minNum;
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr1 = { -44, -45, -22, -25, -47, 29, 46 };
		Assignment50 a = new Assignment50();
		int minNum1=a.minNum(arr);
		int minNum2=a.minNum(arr1);
		System.out.println(minNum1);
		System.out.println(minNum2);

	}

}
