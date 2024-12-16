package prem;

public class Assignment52 {

	int[] getMaxMinNum(int[] num) {
		int[] output = new int[2];
		int max = num[0];
		int min = num[0];

		for (int i = 1; i < 2; i++) {

			for (int j = 1; j < num.length; j++) {
				if (max < num[j]) {
					max = num[j];
				}
				if (min > num[j]) {
					min = num[j];
				}
			}
		}
		output[0] = max;
		output[1] = min;

		return output;
	}

	public static void main(String[] args) {
		Assignment52 assign52 = new Assignment52();
		int[] digit = { 44, 45, 22, 25, 47, 29, 46 };
		int[] output = assign52.getMaxMinNum(digit);
		System.out.println("Max number in array is " + output[0]);
		System.out.println("Min number in array is " + output[1]);

		int[] digit1 = { -44, -45, -22, -25, -47, -29, -46 };
		assign52.getMaxMinNum(digit1);
		int[] output1 = assign52.getMaxMinNum(digit1);
		System.out.println("Max number in array is " + output1[0]);
		System.out.println("Min number in array is " + output1[1]);
	}
}
