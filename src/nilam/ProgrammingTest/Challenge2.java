package nilam.ProgrammingTest;

public class Challenge2 {

	void printReverseArray(String[] str) {

		for (int index = 0; index < str.length; index++) {
			int vowel = 0;

			for (int i = 0; i < str[index].length(); i++) {
				char ch = str[index].charAt(i);
				if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
					vowel++;
				}
			}
			if (vowel > 1) {
				for (int j = str[index].length() - 1; j >= 0; j--)
					System.out.print(str[index].charAt(j));
			} else
				System.out.println("\n" + str[index]);
		}
	}

	public static void main(String[] args) {
		Challenge2 challenge2 = new Challenge2();
		String[] str = { "apple", "sky", "orange", "try", "eggle" };
		challenge2.printReverseArray(str);
	}
}
