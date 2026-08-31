package ajay_ArrayAssignments;

public class Assignment49 {
	void getMaxNumber(int[] input) {
		int max = 44;
		for (int i = 0; i < input.length; i++) {

			if (max < input[i]) {
				max = input[i];

			}

		}
		System.out.println("The Max Number from given Array is : " + max);

	}

	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		assignment49.getMaxNumber(input);

	}

}
