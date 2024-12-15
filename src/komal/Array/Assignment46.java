//Assignment - 46 : 15th Dec'2024 [15 mins]
//Print middle character of all the names from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Rohan -> h 
//Premlata -> m
//Anuja -> u
//Fazrana -> r

package komal.Array;

public class Assignment46 {

	void getMiddleCharacter(String[] names) {

		for (int i = 0; i < names.length; i++) {
			// if in Premlata -> middle ch either m or l it depends on interviwer so if m
			// then
			if (names[i].length() % 2 == 0) {
				int index = names[i].length() / 2 - 1;
				System.out.println(names[i] + " -> " + names[i].charAt(index));
			} else {
				System.out.println(names[i] + " -> " + names[i].charAt(names[i].length() / 2));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		Assignment46 a46 = new Assignment46();
		a46.getMiddleCharacter(names);
	}
}
