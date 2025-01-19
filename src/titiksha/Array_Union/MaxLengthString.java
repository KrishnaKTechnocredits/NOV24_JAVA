//Return the maximum length string from given array.
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : Technocredits

package titiksha.Array_Union;

public class MaxLengthString {
	String getmaxLengthString(String[] arr) {
		String maxlength = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (maxlength.length() < arr[j].length()) {
					maxlength = arr[i];

				}
			}
		}
		return maxlength;
	}
	
	String getsecondhightest(String[] arr) {
		String secondMax = null;
		String maxLength = arr[0];

		if (arr[1].length() > maxLength.length()) {
			secondMax = maxLength;
			maxLength = arr[1];
		} else {
			secondMax = arr[1];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i].length() > maxLength.length()) {
				secondMax = maxLength;
				maxLength = arr[i];
			} else if (arr[i].length() > secondMax.length() && arr[i].length() < maxLength.length()) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		MaxLengthString maxLengthString = new MaxLengthString();
		String result[] = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		String output = maxLengthString.getmaxLengthString(result);
		System.out.println("The Highest length String from array is :");
		System.out.println(output);
		String output1 = maxLengthString.getsecondhightest(result);
		System.out.println("The Second Highest length String from array is :");
		System.out.println(output1);

	}
}
