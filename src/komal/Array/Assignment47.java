//Assignment - 47 : 15th Dec'2024 [12 mins]
//Print only names having length more than 6 characters from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Premlata
//Fazrana

package komal.Array;

public class Assignment47 {

	void getNames(String[] names) {

		System.out.println("Names having length more than 6 characters: ");
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > 6) {
				System.out.println(names[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		Assignment47 a47 = new Assignment47();
		a47.getNames(names);
	}
}
