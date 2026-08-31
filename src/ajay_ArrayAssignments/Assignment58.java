package ajay_ArrayAssignments;

public class Assignment58 {

	String getsecondMaxLengthString(String[] input) {
		String maxLengthString = "";
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxLengthString.length()) {
				maxLengthString = input[i];
			}
		}
		return maxLengthString;
	}

	String secondMaxLenthString(String[] input) {
		String maxLengthString = getsecondMaxLengthString(input);
		String secondMaxLengthString = "";
		for (int i = 0; i < input.length; i++) {

			if (input[i].length() < maxLengthString.length()) {
				if (input[i].length() > secondMaxLengthString.length()) {
					secondMaxLengthString = input[i];
				} else if (input[i].length() == secondMaxLengthString.length()) {
					secondMaxLengthString = input[i];
				}
			}
		}
		return secondMaxLengthString;
	}

	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		String result2 = assignment58.secondMaxLenthString(input);
		System.out.println("Second Max Length String from given Strings is =" + result2);
	}

}
