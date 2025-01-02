package vrushali.arrayProgram;
//Assignment - 46 : 15th Dec'2024 [15 mins]

//Print middle character of all the names from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Rohan -> h 
//Premlata -> m
//Anuja -> u
//Fazrana -> r

public class PrintMiddileCharFromArray {
	void printMiddileCharFromArray(String[] nameArray) {
		char ch;
		String name;
		for (int i = 0; i < nameArray.length; i++) {
			name = nameArray[i];
			if (name.length() % 2 == 0) {
				ch = name.charAt((name.length() / 2) - 1);
			} else {
				ch = name.charAt((name.length() / 2) - 1);
			}
			System.out.println(name + " --> " + ch);
		}
	}

	public static void main(String[] args) {
		PrintMiddileCharFromArray printMiddileChar = new PrintMiddileCharFromArray();
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		printMiddileChar.printMiddileCharFromArray(names);

	}

}
