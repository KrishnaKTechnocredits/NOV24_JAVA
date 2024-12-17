package Assignment_Array;

public class Assignment50 {
	int getMinimumNumber(int[] num) {
		int minNumber = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < minNumber) {
				minNumber = num[i];
			}
		}
		return minNumber;
	}

	public static void main(String[] args) {
		Assignment50 demo = new Assignment50();
		int[] num = {44,45,22,25,47,29,46};
		int[] arr = {-44,-45,-22,-25,-47,29,46};
		System.out.println("Minimum number in the given array : " + demo.getMinimumNumber(num));
		System.out.println("Minimum number in the given array : " + demo.getMinimumNumber(arr));
	}
}
