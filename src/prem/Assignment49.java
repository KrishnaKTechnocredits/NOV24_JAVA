package prem;

public class Assignment49 {

	int getMaxNum(int[] num) {
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				if (max < num[j]) {
					max = num[j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] digit = { 44, 45, 22, 25, 47, 29, 46 };
		int[] digit1 = { -44, -45, -22, -25, -47, -29, -46 };
		Assignment49 assign49 = new Assignment49();
		int max = assign49.getMaxNum(digit);
		System.out.println("Max number in array is " + max);

		int max1 = assign49.getMaxNum(digit1);
		System.out.println("Max number in array is " + max1);

	}
}
