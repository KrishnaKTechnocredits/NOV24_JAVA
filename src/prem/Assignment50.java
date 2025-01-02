package prem;

public class Assignment50 {

	int getMinNum(int[] digit) {
		int min = digit[0];
		for (int i = 1; i < digit.length; i++) {
			for (int j = 1; j < digit.length; j++) {
				if (min > digit[j]) {
					min = digit[j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Assignment50 assign50 = new Assignment50();
		int[] num1 = { 44, 45, 22, 25, 47, 29, 46 };
		int ans = assign50.getMinNum(num1);
		System.out.println("Min number in array is " + ans);

		int[] num2 = { -44, -45, -22, -25, -47, 29, 46 };
		int ans1 = assign50.getMinNum(num2);
		System.out.println("Min number in array is " + ans1);
	}
}
