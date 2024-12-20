package rushikesh.ArrayAssignments;

public class Assignment_49 {

	int getMaxNum(int[] arr) {
		int maxNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum = arr[index]; //update maxNum
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_49 assignment_49 = new Assignment_49();
		int[] arr1 = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr2 = { -44,-45,-22,-25,-47,-29,-46 };
		System.out.println(assignment_49.getMaxNum(arr1));
		System.out.println(assignment_49.getMaxNum(arr2));
	}

}
