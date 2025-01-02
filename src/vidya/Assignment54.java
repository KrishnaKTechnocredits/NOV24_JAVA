package vidya;

public class Assignment54 {
	int[] ReverseArray(int[] arr) {
		int[] reversedArr = new int[arr.length];

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			reversedArr[j] = arr[i];
		}

		return reversedArr;
	}

	public static void main(String[] args) {
		int[] numberArray = { 10, 34, 22, 16, 19, 99 };
		Assignment54 ass54 = new Assignment54();
		int[] reversedArray = ass54.ReverseArray(numberArray);

		System.out.println("Reversed Array:");
		for (int i=0;i<reversedArray.length;i++) {
			System.out.print(reversedArray[i]+" ");
		}
	}
}
