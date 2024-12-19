package nitish;

public class MaxAndMin {
	void output(int[] num) {
		int max = num[0];
		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			int num2 = num[i];
			if (num2 > max) {
				max = num2;
			}else if(num2<min) {
				min=num2;
			}
		}
		System.out.println("Maximum number is = "+max);
		System.out.println("Minimum number is = "+min);
	}

	public static void main(String[] args) {
		MaxAndMin obj = new MaxAndMin();
		int[] num = { 5, 10, 15, 45, 60, 99, 2, 8 };
		obj.output(num);
	}

}
