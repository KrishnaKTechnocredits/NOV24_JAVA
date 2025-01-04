package prem;

public class Assignment59 {

	void allSecMaxString(String[] input) {
		int maxCount = input[0].length();
		int secMaxCount = input[1].length();
		String secMaxLenOutput = input[1];

		for (int i = 1; i <= input.length - 1; i++) {
			if (maxCount < input[i].length()) {
				maxCount = input[i].length();
			} else if (secMaxCount < input[i].length()) {
				secMaxLenOutput = input[i];
				secMaxCount = input[i].length();

			}
		}
		for (int j = 0; j <= input.length - 1; j++) {
			if (secMaxCount == input[j].length()) {
				secMaxLenOutput = input[j];
				System.out.println(secMaxLenOutput);
			}
		}
	}

	public static void main(String[] args) {
		Assignment59 assign59 = new Assignment59();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		assign59.allSecMaxString(input);

	}

}
