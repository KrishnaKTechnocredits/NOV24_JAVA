package ajay_ArrayAssignments;

public class Assignment46 {

	void getMiddileOfString(String[] input) {
		System.out.println("Middle Character of each String in given array is : ");
		for (int i = 0; i < input.length; i++) {
			int index = input[i].length() / 2;

			char ch = input[i].charAt(index);
			System.out.println(input[i] + "-> " + ch);
		}

	}

	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] input = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		assignment46.getMiddileOfString(input);
	}

}
