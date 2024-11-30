package mahesh;

public class Assignment_21 {
	static int countSpace;
	static String string;
	
	int countLength (String str) {
		for (int index=0; index<=str.length()-1; index++) {
			char ch = str.charAt(index);
			if (ch == ' ') {
				countSpace++;
			}
		}
		string = str;
		return countSpace;
	}
	
	public static void main(String[] args) {
		Assignment_21 assignment = new Assignment_21();
		assignment.countLength("Java at Techno Credits");
		int strLen = string.length()- countSpace;
		System.out.println("Length of given string without space is '"+ strLen+"' and space characters are '"+countSpace+"'.");
	}

}
