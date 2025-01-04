package pankaj;

public class Assignment55 {

	int[] unionArray(int[] arr, int[] arr1) {
		int[] output = new int[arr.length + arr1.length];
		int k = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			output[k] = arr[i];
			k++;
		}
		for (int j = 0; j <= arr1.length - 1; j++) {
			output[k] = arr1[j];
			k++;
		}

		return output;
	}

	public static void main(String[] args) {
		Assignment55 A = new Assignment55();
		int[] arr3 = { 10, 19, 18 };
		int[] arr4 = { 99, 8 };
		int[] num = A.unionArray(arr3, arr4);
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println(" " + num[i]);
		}

	}

}
