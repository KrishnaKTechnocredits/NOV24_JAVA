/* Assignment - 28 : 2nd Dec'2024 [20 mins]

write a method to print all the characters having ascii value from 65 to 100.

output : 
65 -> A
66 -> B 
so on .. 

write a method to print ascii values for character A to Z.
output : 
A -> 65
B -> 66
..
..
Z -> 90
*/

package nikita.stringdemo;

public class Assignment28 {
	
	private void printCharacterForAscii(int startRange, int endRange) {
		System.out.println("Following is the character for given ascii values: ");
		for (int i = startRange; i<=endRange; i++) {
			System.out.println(i + " --> " + (char)i);
		}
	}
	
	private void printAsciiForCharacter(String str) {
		System.out.println("\nFollowing is the Ascii values for given characters: ");
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = ch;
			System.out.println(ch + " --> " + ascii);
		}
	}

	public static void main(String[] args) {
		Assignment28 a28 = new Assignment28();
		a28.printCharacterForAscii(65, 100);
		String input = "ABCCDEFGHIJKLMNOPQRSTUVWXYZ";
		a28.printAsciiForCharacter(input);
		}

	}