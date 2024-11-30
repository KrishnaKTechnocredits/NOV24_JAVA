package sachin;

public class Assignment21 {

//	Find the length of the given string excluding space. 
//
//	input : prem lata gupta
//	output : length without space is 13 and space characters are 2. 
//	

	void getlength(String name) {
		int count = 0;
		int abc = 0;
		char st = ' ';
		for (int index = 0; index < name.length(); index++) {

			abc = name.length();

			if (name.charAt(index) == st) {

				count++;

			}

		}

		System.out.println("length without space is :" + (abc - count) + " and " + "Space character is : " + count);
		// System.out.println(abc-count);
	}

	public static void main(String[] args) {

		new Assignment21().getlength("prem lata gupta");

	}

}
