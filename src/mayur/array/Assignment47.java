/*
 * Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana

 */

package mayur.array;

public class Assignment47 {
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for (int i=0; i<names.length;i++ ) {
			if (names[i].length()>6) {
				System.out.println(names[i]);
			}
		}
	}
}
