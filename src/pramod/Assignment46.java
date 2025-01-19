/*
Assignment - 46 : 15th Dec'2024 [15 mins] [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r
*/
package pramod;

class Assignment46 {

	void printMiddleLetter(String[] names) {
		for (int i = 0; i < names.length; i++) {
			int strLength = names[i].length();
			if (strLength % 2 == 0) {
				char ch1 = names[i].charAt(strLength / 2 - 1);
				System.out.println(names[i] + " -> " + ch1);
			} else {
				char ch = names[i].charAt(strLength / 2);
				System.out.println(names[i] + " -> " + ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment46 middleLetter = new Assignment46();
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		middleLetter.printMiddleLetter(names);
	}
}