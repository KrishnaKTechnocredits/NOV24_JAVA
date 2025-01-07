//Print only names having length more than 6 characters from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//output : 
//Premlata
//Fazrana

package titiksha.Array;

public class Lengthmorethansix {
	void maxLength() {
		String[] name = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		for (int i = 0; i < name.length; i++) {
			int ch = name[i].length();
			if (ch > 6) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		Lengthmorethansix lengthmorethansix = new Lengthmorethansix();
		// String[] name ={"Rohan", "Premlata", "Anuja", "Fazrana"};
		lengthmorethansix.maxLength();
	}
}
