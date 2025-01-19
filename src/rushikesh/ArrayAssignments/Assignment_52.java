package rushikesh.ArrayAssignments;

public class Assignment_52 {

	int[] getMaxMinNumber(int[] arr, int[] output) {
		int maxNum = arr[0];
		int minNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum = arr[index];
			}
			if (minNum > arr[index]) {
				minNum = arr[index];
			}
		}
		output[0] = maxNum;
		output[1] = minNum;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_52 assignment_52 = new Assignment_52();
		int[] input = new int[2];
		int[] arr1 = { 44, 45, 22, 25, 47, 29, 46 };
		int[] output = assignment_52.getMaxMinNumber(arr1, input);
		System.out.println("{" + output[0] + "," + output[1] + "}");

	}
}
