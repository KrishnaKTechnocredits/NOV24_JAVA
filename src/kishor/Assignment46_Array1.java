package kishor;

public class Assignment46_Array1 {

	void displayMiddleChar(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() % 2 != 0) {
				System.out.println(input[i] + "->" + input[i].charAt(input[i].length() / 2));
			} else {
				System.out.println(input[i] + "->" + input[i].charAt(input[i].length() / 2 - 1));
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		Assignment46_Array1 assignment46 = new Assignment46_Array1();
		assignment46.displayMiddleChar(names);
	}
}
