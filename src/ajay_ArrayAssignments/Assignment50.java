package ajay_ArrayAssignments;

public class Assignment50 {
	int getMaxNumber(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length; i++) {

			if (max < input[i]) {
				
				max = input[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		int[] input = { 44, 45, 22, 25, 47, 29, 46 };
		System.out.println("The Max Number from given String is : "+assignment50.getMaxNumber(input));

	}

}
