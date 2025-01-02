package rushikesh.ArrayAssignments;

public class Assignment_59 {

	void getSecondMaxLengthString(String[] arr) {
		String maxString = arr[1];
		String secondMaxString = arr[0];
		if (arr[0].length() > arr[1].length()) {
			maxString = arr[0];
			secondMaxString = arr[1];
		}
		for (int index = 2; index < arr.length; index++) {
			if (maxString.length() < arr[index].length()) {
				secondMaxString = maxString;
				maxString = arr[index];
			} else if (secondMaxString.length() < arr[index].length()) {
				secondMaxString = arr[index];
			}
		}
		printAllString(arr, secondMaxString.length());
	}

	void printAllString(String[] arr, int targetLength) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() == targetLength) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_59 assignment_59 = new Assignment_59();
		String[] arr = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		assignment_59.getSecondMaxLengthString(arr);
	}
}
