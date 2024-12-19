package roshan.array;

public class LengthMoreThan6char {

	void get6CharString(String[] name) {
		for (int i = 0; i < name.length; i++) {
			int n = name[i].length();
			if (n > 6) {
				System.out.println(" Names having length more than 6 characters is >> " + name[i]); // forgot to right
																									// array i in name
			}
		}

	}

	public static void main(String[] args) {
		String[] name = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		LengthMoreThan6char lengthmorethan6char = new LengthMoreThan6char();
		lengthmorethan6char.get6CharString(name);
	}

}
	
/*
 * Assignment - 47 : 15th Dec'2024 [12 mins] Print only names having length more
 * than 6 characters from given String array. String[] names = {"Rohan",
 * "Premlata", "Anuja", "Fazrana"};
 * 
 * output : Premlata Fazrana
 */