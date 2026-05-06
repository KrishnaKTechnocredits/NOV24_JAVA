package ashwini.ArrayProgram;

public class ArrayDivBy5or7 {
	int getSumOfNumbersDivBy5or7(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 5 == 0 || arr[index] % 7 == 0) {

				sum = sum + arr[index];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		ArrayDivBy5or7 a1 = new ArrayDivBy5or7();
		int[] arr = { 44, 45, 22, 25, 21, 29 };
		int ans = a1.getSumOfNumbersDivBy5or7(arr);
		System.out.println(ans);

	}
}
