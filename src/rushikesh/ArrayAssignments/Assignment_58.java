package rushikesh.ArrayAssignments;

public class Assignment_58 {

	String getSecondMaxString(String[] arr) {
		String maxString = arr[0];
		String secondMaxString = arr[1];
		if (arr[1].length() > arr[0].length()) {
			maxString = arr[1];
			secondMaxString = arr[0];
		}
		for (int index = 2; index < arr.length; index++) {
			if (maxString.length() < arr[index].length()) {
				secondMaxString = secondMaxString;
				maxString = arr[index];
			} else if (secondMaxString.length() <= arr[index].length()) {
				secondMaxString = arr[index];
			}
		}
		return secondMaxString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_58 assignment_58 = new Assignment_58();
		String[] arr = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune", "PuGlobantne" };
		System.out.println(assignment_58.getSecondMaxString(arr));
	}
}
