/*
Assignment - 46 : 15th Dec'2024 [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r
*/

package amruta.ArrayPrograms;

public class Assign_46_FindMiddleCharacterOfStringInArray {

	static char returnMiddleChar(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			if (str.length() % 2 == 0) {
				int num = (str.length() / 2) - 1;	
				ch = str.charAt(num);
			} else {
				int num = str.length() / 2;
				ch = str.charAt(num);
			}
		}
		return ch;
	}

	void getArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			char ch = returnMiddleChar(arr[index]);
			System.out.println("Middle Character of string " + arr[index] + " is --> " + ch);
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };

		Assign_46_FindMiddleCharacterOfStringInArray a46 = new Assign_46_FindMiddleCharacterOfStringInArray();
		a46.getArray(names);
	}
}