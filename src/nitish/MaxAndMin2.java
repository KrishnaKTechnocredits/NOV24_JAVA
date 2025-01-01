package nitish;

public class MaxAndMin2 {

	int maxNum(int[] num) {
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			int num2 = num[i];
			if (num2 > max) {
				max = num2;
			}
		}
		return max;
	}

	int minNum(int[] num) {
		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			int num2 = num[i];
			if (num2 < min) {
				min = num2;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		MaxAndMin2 obj = new MaxAndMin2();
		int[] num = { -2, -18, 15, 45, 60, 99, -1, 3 };
		int maximum = obj.maxNum(num);
		int minimum = obj.minNum(num);
		System.out.println("Maximum number is = '" + maximum+"'");
		System.out.println("Minimum number is = '" + minimum+"'");
	}
}
