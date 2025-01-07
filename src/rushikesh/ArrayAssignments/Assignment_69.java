package rushikesh.ArrayAssignments;

public class Assignment_69 {

	void printFreqOfEachWord(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			String word = arr[index];
			if (!word.equals("")) {
				for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
					if (arr[innerIndex].equals(word)) {
						arr[innerIndex] = "";
						count++;
					}
				}
				System.out.println(word + "->" + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_69 assignment_69 = new Assignment_69();
		assignment_69.printFreqOfEachWord("Hi Hello Hi Hi Hi Techno Credits Techn");
	}

}
