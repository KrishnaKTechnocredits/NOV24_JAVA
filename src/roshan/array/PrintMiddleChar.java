package roshan.array;

public class PrintMiddleChar {

	static void findMiddleChar(String[] name) {
		for (int i = 0; i < name.length; i++) {
			int n = name[i].length();
			if (n % 2 == 0) {
// if string is even number and asked for string roshan middle char is 's' so this logic works other wise condition and second if not require
				System.out.println(name[i] + " >> " + name[i].charAt((n / 2) - 1));
			} else {
				System.out.println(name[i] + " >> " + name[i].charAt((n / 2)));

			}

		}

	}

	public static void main(String[] args) {
		// String[] name = { "Roshan", "Anvit", "fazrana" };
		String[] name = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		PrintMiddleChar.findMiddleChar(name);
	}
}

/*
 * Assignment - 46 : 15th Dec'2024 [15 mins] Print middle character of all the
 * names from given String array. String[] names = "Premlata", "Anuja",
 * "Fazrana"};
 * 
 * output : Rohan -> h Premlata -> m Anuja -> u Fazrana -> r
 */