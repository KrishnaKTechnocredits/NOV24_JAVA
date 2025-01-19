package rohan;

public class Assignment37_1 {

	void CountCharactor(String input) {

		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			char ch = input.charAt(i);
			if (input.indexOf(ch) == i) {
				for (int j = 0; j < input.length(); j++) {
					if (input.charAt(i) == input.charAt(j)) {
						count++;
					}
				}
				System.out.println(input.charAt(i) + "=" + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment37_1 assignment = new Assignment37_1();
		assignment.CountCharactor("aakansha");

	}

}
