package rushikesh.ArrayAssignments;

public class Assignment_53 {

	int[] getArrayInReverseOrder(int[] arr) {
		int[] output = new int[6];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = arr[i];
		}
		return output;
	}

	void printArryInReverseOrder(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(getArrayInReverseOrder(arr)[j]);
		}
	}

	public static void main(String[] args) {
		Assignment_53 assignment_53 = new Assignment_53();
		int[] arr = { 10, 34, 22, 16, 19, 99 };
		assignment_53.printArryInReverseOrder(arr);
	}
}
