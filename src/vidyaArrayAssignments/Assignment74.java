package vidyaArrayAssignments;

public class Assignment74 {
	void rotateArray(int[] arr) {
		int last = arr[arr.length - 1]; // last element
		for (int i = arr.length - 1; i > 0; i--) {

			arr[i] = arr[i - 1]; // shift to right
		}
		arr[0] = last;

	}

	public static void main(String[] args) {
		Assignment74 ass74 = new Assignment74();
		int[] numbers = { 10, 20, 30, 40, 50 };
		ass74.rotateArray(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
