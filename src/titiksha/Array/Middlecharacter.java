//Print middle character of all the names from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//output : 
//Rohan -> h 
//Premlata -> m
//Anuja -> u
//Fazrana -> z

package titiksha.Array;

public class Middlecharacter {
	void getMiddleCharacter() {
		int middlecharacter;
		String[] ch = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		for (int i = 0; i < ch.length; i++) {// applying loop to get 1st string from array
			if (ch[i].length() % 2 != 0) { 
				middlecharacter = ch.length / 2;
				char chaaracter = ch[i].charAt(middlecharacter);
				System.out.println(ch[i] + "--->" + chaaracter);

			} else {
				middlecharacter = (ch[i].length() / 2) - 1;
				char chaaracter = ch[i].charAt(middlecharacter);
				System.out.println(ch[i] + "--->" + chaaracter);
			}
		}
	}

	public static void main(String[] args) {
		Middlecharacter middlecharacter = new Middlecharacter();
		middlecharacter.getMiddleCharacter();
	}
}
