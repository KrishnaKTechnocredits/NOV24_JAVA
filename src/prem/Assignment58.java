package prem;

public class Assignment58 {

	String getSecMaxString(String[] input) {
		int maxCount = input[0].length();
		int secMaxCount = input[1].length();
		String secMaxLenOutput = input[1];

		for (int i = 1; i <= input.length - 1; i++) {
			if (maxCount < input[i].length()) {
				maxCount = input[i].length();
			}else if (secMaxCount <= input[i].length()) {
				secMaxLenOutput = input[i];
				secMaxCount = input[i].length();
		    }
		}
		return secMaxLenOutput;
	}

	public static void main(String[] args) {
		Assignment58 assign58 = new Assignment58();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		String secMaxLength = assign58.getSecMaxString(input);
		System.out.println(secMaxLength);
	}
}
