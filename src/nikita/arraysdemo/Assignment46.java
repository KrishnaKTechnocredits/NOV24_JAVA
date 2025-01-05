/* Assignment - 46 : 15th Dec'2024 [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r */

package nikita.arraysdemo;

public class Assignment46 {

	void m1(String[] names) {
		for (int i = 0; i<names.length; i++) {
			if (names[i].length() % 2 != 0) {
			System.out.println(names[i] + "-->" + names[i].charAt(names[i].length() / 2 )); 
			}
			else {
				System.out.println(names[i] + "-->" + names[i].charAt(names[i].length() / 2 - 1)); 
			}
		}
	}
	public static void main(String[] args) {
		String[] input = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		Assignment46 a46 = new Assignment46();
		a46.m1(input);
	}
}
