package Assignment_Array;

public class Assignment49 {

	int getMaximuNumber(int[] num) {
		int maxNumber = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > maxNumber) {
				maxNumber = num[i];
			}
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		Assignment49 demo = new Assignment49();
		int[] num = { 44, 45, 22, 25, 21, 29 };
		int[] arr = {-44,-45,-22,-25,-47,-29,-46};
		System.out.println("Maximum number in the given array : " + demo.getMaximuNumber(num));
		System.out.println("Maximum number in the given array : " + demo.getMaximuNumber(arr));
	}
}
