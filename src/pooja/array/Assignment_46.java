package pooja.array;
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

public class Assignment_46 {

	void printMiddleChar(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			String s = strs[i];
			if (s.length() % 2 == 0) {
				System.out.println(s + " - > " + s.charAt(s.length() / 2 - 1));
			} else {
				System.out.println(s + " -> " + s.charAt(s.length() / 2));
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		Assignment_46 assignment_46 = new Assignment_46();
		assignment_46.printMiddleChar(names);
	}
}