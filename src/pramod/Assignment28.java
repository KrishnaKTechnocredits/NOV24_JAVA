/*
Assignment - 28 : 2nd Dec'2024 [20 mins]

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
package pramod;
class Assignment28 {
	
	void printCharacterOfAscii(int startRange, int endRange) {
		for(int index = startRange; index <= endRange; index++) {
			System.out.println("Character of " +index+" -> " + (char)index);
		}
	}
	
	void printAsciiValueOfAZ(String str) {
		System.out.println("----------------------------------------");
		System.out.println("Ascii values for given character is: ");
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			System.out.print("Ascii value of " +ch+" -> ");
			int ascii = str.charAt(index);
			System.out.println(ascii);
			}
	}
	
	public static void main(String[] args) {
			Assignment28 ascii = new Assignment28();
			ascii.printCharacterOfAscii(65,100);
			String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			ascii.printAsciiValueOfAZ(input);
	}	
}