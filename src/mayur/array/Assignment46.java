/*
 * Assignment - 46 : 15th Dec'2024 [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r
 */

package mayur.array;

public class Assignment46 {
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for (int i=0; i<names.length;i++ ) {
			if (names[i].length()%2==0) {
				int len = names[i].length();
				len = len/2 -1;
				char ch = names[i].charAt(len);
				System.out.println(names[i]+" --> "+ch);
			}else {
				int len = names[i].length();
				len = len/2;
				char ch = names[i].charAt(len);
				System.out.println(names[i]+" --> "+ch);
			}
		}
	}
}
