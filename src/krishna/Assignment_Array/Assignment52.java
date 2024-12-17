package Assignment_Array;

public class Assignment52 {
	int[] getDivisibleNumbersSum(int[] num) {
		int maxNumber = num[0];
		int minNumber = num[0];
		int[] arr = new int[2];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < minNumber) {
				minNumber = num[i];
			} else if(num[i]>maxNumber) {
				maxNumber = num[i];
			}
		}
		arr[0] = maxNumber;
		arr[1] = minNumber;
		return arr;
	}

	public static void main(String[] args) {
		int[] num = { -44, -45, -22, -25, 21, 29 };
		int[] output = new Assignment52().getDivisibleNumbersSum(num);
		for(int i =0;i<output.length;i++) {
			System.out.println(output[i]);
		}
	}
}
