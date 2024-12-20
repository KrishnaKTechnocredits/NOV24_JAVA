/*
Assignment - 47 : 15th Dec'2024 [12 mins] [5 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana
*/
package pramod;

class Assignment47 {

	void printName(String[] names) {
		for (int i = 0; i < names.length; i++) {
			int strLength = names[i].length();
			if (strLength > 6) {
				System.out.println(names[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment47 A47 = new Assignment47();
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		A47.printName(names);
	}
}