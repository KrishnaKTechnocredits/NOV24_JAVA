package deepali.arrayProgram;

/*Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r
*/
public class Assignment_46 {

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index] + " > " + names[index].length());
		}

	}

}
