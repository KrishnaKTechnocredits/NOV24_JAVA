package rohan;

public class Assignment32_1 {

	void CountCharactor(String input) {

		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			if (input.indexOf(input.charAt(i)) == i) {
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
		Assignment32_1 assignment = new Assignment32_1();
		assignment.CountCharactor("technocredits");
	}

}
