package deepali.arrayProgram;

/*Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana
*/
public class Assignment_47 {

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		for (int index = 0; index < names.length; index++) {
			if (names[index].length() > 6)
				System.out.println(names[index]);
		}
	}
}
