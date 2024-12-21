//Assignment - 46 : 15th Dec'2024 [15 mins]
//Print middle character of all the names from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Rohan -> h 
//Premlata -> m
//Anuja -> u
//Fazrana -> r

package harshada.array;

public class ArrayAss1 {

	void getMidChar(String[] input) {
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (str.length() % 2 != 0) {
				System.out.println(str + " -> " + str.charAt(str.length() / 2));
			} else if (str.length() % 2 == 0) {
				System.out.println(str + " -> " + str.charAt(str.length() / 2 - 1));
			}
		}
	}

	public static void main(String[] args) {
		ArrayAss1 arrayAss1 = new ArrayAss1();
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		arrayAss1.getMidChar(names);
	}
}
