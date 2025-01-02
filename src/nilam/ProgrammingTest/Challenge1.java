package nilam.ProgrammingTest;

public class Challenge1 {

	void printSumOfArrayElements(int[] arr) {

		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				} else

					sum = sum + arr[j];
				arr2[i] = sum;
			}

		}
		for (int index = 0; index < arr2.length; index++) {
			System.out.println(arr2[index]);
		}

	}

	public static void main(String[] args) {
		Challenge1 challenge1 = new Challenge1();
		int[] arr = { 3, 5, 7, 1, 9 };
		challenge1.printSumOfArrayElements(arr);
	}

}
