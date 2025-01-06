//return the word having highest digits in the given String .
//String str = "H2i22 H1ello Techno C2red3i3t4s5";

//output : C2red3i3t4s5

package rushikesh.ArrayAssignments;

public class Assignment_71 {

	String getWordOfHighestDigit(String str) {
		String[] arr = str.split(" ");
		String highestDigitword = "";
		int maxCount = 0;
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			String word = arr[index];
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				if (Character.isDigit(word.charAt(innerIndex))) {
					count++;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				highestDigitword = word;
			}
		}
		return highestDigitword;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_71 assignment_71 = new Assignment_71();
		String word = assignment_71.getWordOfHighestDigit("H2i22 H1ello Techno C2red3i3t4s5");
		System.out.println(word);
	}

}
