package deepali;

/*Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2.
*/
public class Assignment_21 {
	int countWithSpace = 0;
	int countWithoutSpace = 0;

	void getStringLenght(String str) {
		int totalLenghtWithSpace = str.length();
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ' ') {
				countWithoutSpace++;
			}
		}
		int lengthWithoutSpace = totalLenghtWithSpace - countWithoutSpace;
		System.out.println(
		"Length without space is " + lengthWithoutSpace + " "+ "and space character are"+" " + countWithoutSpace);
	}

	public static void main(String[] args) {
		Assignment_21 assignment = new Assignment_21();
		assignment.getStringLenght("prem lata gupta");
	}
}
