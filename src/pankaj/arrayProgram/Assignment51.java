package pankaj.arrayProgram;

public class Assignment51 {

	void minMax(int[] arr) {
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("The Min value is=>> " + min + "The Max value is=>> " + max);
	}

	public static void main(String[] args) {
		int[] data = { 44, 45, 22, 25, 47, 29, 46 };
		Assignment51 A = new Assignment51();
		A.minMax(data);
	}
}
