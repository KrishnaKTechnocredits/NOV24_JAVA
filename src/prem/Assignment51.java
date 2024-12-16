package prem;

public class Assignment51 {

	void printMaxMinNum(int[] num) {
		for (int i = 1; i < 2; i++) {
			int max = num[0];
			int min = num[0];
			for (int j = 1; j < num.length; j++) {
				if (max < num[j]) {
					max = num[j];
				} else if (min > num[j]) {
					min = num[j];
				}
			}
			System.out.println("Max number in array is " + max);
			System.out.println("Min number in array is " + min);
		}
	}

	public static void main(String[] args) {
		int[] digit = { 44, 45, 22, 25, 47, 29, 46 };
		int[] digit1 = { -44, -45, -22, -25, -47, -29, -46 };
		Assignment51 assign51 = new Assignment51();
		assign51.printMaxMinNum(digit);
		assign51.printMaxMinNum(digit1);
	}

}
