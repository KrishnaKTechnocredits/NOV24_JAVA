package rushikesh.ArrayAssignments;

public class Assignment_54 {

	void printArrayInReverseOrder(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_54 assignment_54 = new Assignment_54();
		int[] arr = { 10, 34, 22, 16, 19, 99 };
		assignment_54.printArrayInReverseOrder(arr);
	}
}
