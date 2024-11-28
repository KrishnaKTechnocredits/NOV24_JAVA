package rushikesh.StringDemoAssignment;

public class Assignment_21 {

	int getLengthOfString(String str) {

		int spaceCount = 0;
		int countChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceCount++;
			}
			if (str.charAt(i) != ' ') {
				countChar++;
			}
		}
		System.out.println("length without space is " + countChar + " and space characters are " + spaceCount);
		return spaceCount + countChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_21 assignment_21 = new Assignment_21();
		System.out.println("Total length of original string is " + assignment_21.getLengthOfString("tes chn o"));

	}

}
