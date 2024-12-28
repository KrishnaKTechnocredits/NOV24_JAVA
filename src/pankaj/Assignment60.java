package pankaj;

public class Assignment60 {

	int[] secondMaxNum(int[] arr) {
		int maxNum = arr[0];
		int secondMax = arr[1];

		if (maxNum < arr[1]) {
			maxNum = arr[1];
			secondMax = arr[0];
		}
		for (int i = 1; i <= arr.length - 1; i++) {
			if (maxNum < arr[i]) {
				secondMax = maxNum;
				maxNum = arr[i];
			} else if (secondMax < arr[i]) {
				secondMax = arr[i];
			}
		}
		System.out.println(maxNum + " :: " + secondMax);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 33, 33, 19, 55, 53, 11 };
		Assignment60 A = new Assignment60();
		A.secondMaxNum(arr);
	}

}
