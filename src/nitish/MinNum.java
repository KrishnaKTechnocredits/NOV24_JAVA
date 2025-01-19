package nitish;

public class MinNum {
	int output(int[] num) {

		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			int num2 = num[i];
			if (num2< min) {
				min = num2;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		MinNum obj = new MinNum();
		int[] num = { 20, 10, 15, 45, 60, 99, 2, 8 };
		int minimum = obj.output(num);
		System.out.print("Maximum Number is --> " + minimum);
	}

}
