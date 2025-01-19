package rushikesh.ArrayAssignments;

public class Assignment_70 {

	void printCountOfDigitInEachWord(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			int count = 0;
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				if (Character.isDigit(word.charAt(innerIndex))) {
					count++;
				}
			}
			System.out.println(word + "->" + count);
		}
	}

	public static void main(String[] args) {
		Assignment_70 assignment_70 = new Assignment_70();
		assignment_70.printCountOfDigitInEachWord("H2i22 H1ello Techno C2red3i3t4s5");
	}
}
