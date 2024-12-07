package krishna;

public class Assignment33 {

	void processData(String str) {
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						if (Character.isUpperCase(str.charAt(i))) {
							charCount++;
						}
					}
				}
				System.out.println(
						"freq of upper case character : " + str.charAt(i) + " in a given string is -> " + charCount);
				charCount = 0;
			}
		}
	}

	public static void main(String[] args) {
		new Assignment33().processData("AAkaNSha");
	}
}
