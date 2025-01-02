package rushikesh.ArrayAssignments;

public class Assignment_57 {

	String getStringHavingMaxLength(String[] arr) {
		String maxLengthString = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxLengthString.length() < arr[index].length()) {
				maxLengthString = arr[index];
			}
		}
		return maxLengthString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_57 assignment_57 = new Assignment_57();
		String[] arr = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		System.out.println(assignment_57.getStringHavingMaxLength(arr));
	}
}
