package swapnilArray;

public class Assignment52 {

	int[] findMaxMin(int[] input) {
		int[] a = new int[2];
		int maxNum = input[0];
		int minNum = input[0];
		for (int i = 0; i <= input.length - 1; i++) {
			if (maxNum < input[i]) {
				maxNum = input[i];
			}

			if (minNum > input[i]) {
				minNum = input[i];
			}
		}
		a[0] = maxNum;
		a[1] = minNum;
		return a;

	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		Assignment52 a = new Assignment52();
		int[] ans = a.findMaxMin(arr);
		System.out.println(ans[0]);
		System.out.println(ans[1]);

	}

}
