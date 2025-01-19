package rushikesh.ArrayAssignments;

public class Assignment_48 {

	int getCountOfPositiveNumber(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_48 assignment_48 = new Assignment_48();
		int[] arr = { 10, 30, -45, 66, -10 };
		System.out.println(assignment_48.getCountOfPositiveNumber(arr));
	}

}
