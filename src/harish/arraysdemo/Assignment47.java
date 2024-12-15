package harish.arraysdemo;

/**
 * Assignment - 47 : 15th Dec'2024
 * 
 * Print only names having length more than 6 characters from given String
 * array.
 * 
 * String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
 * 
 * Output - Premlata Fazrana
 */

public class Assignment47 {

	void printNames(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > 6) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment47 assignment47 = new Assignment47();
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		assignment47.printNames(names);
	}

}