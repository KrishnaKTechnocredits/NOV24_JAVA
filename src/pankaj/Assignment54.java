package pankaj;

public class Assignment54 {

	int[] reverse(int[] arr) {
		int[] output = new int[arr.length];
		int k = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (output[k] <= arr[i]) {
				output[k] = arr[i];
				k++;
			}
		}
		System.out.println("The reverse numbers are as follows");
		return output;
	}

	public static void main(String[] args) {
		Assignment54 A = new Assignment54();
		int[] arr1 = { 10, 34, 22, 16, 19, 99 };
		int[] num = A.reverse(arr1);
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println("       " + num[i]);
		}

	}

}
