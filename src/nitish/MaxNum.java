package nitish;

public class MaxNum {
	int output(int[] num) {

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			int num2 = num[i];
			if (num2 > max) {
				max = num2;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MaxNum obj = new MaxNum();
		int[] num = { 20, 10, 15, 45, 60, 99, 2, 8 };
		int Maximum = obj.output(num);
		System.out.print("Maximum Number is --> " + Maximum);
	}
}
