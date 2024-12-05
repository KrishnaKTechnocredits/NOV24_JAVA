package kavita;
/*Assignment - 28 
write a method to print all the characters having ascii value from 65 to 100.
output : 
65 -> A
66 -> B 
so on .. */


/*write a method to print Ascii values for character A to Z.
output : 
A -> 65
B -> 66
..
..
Z -> 90*/
/*Time: 13m*/
public class Assignment28 {
	 void charToAscii(int startRange, int endRange) {
		for (int i = startRange; i <= endRange; i++) {
			System.out.println(i + " the Ascii of the character is " + (char)i);
		}
	}

	 void asciiToChar(String str) {
		 System.out.println("---------------------------");
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			System.out.println(str.charAt(i) + " The character has value " + ascii);
		}
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.charToAscii(65,100);
		
		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		assignment28.asciiToChar(data);
	}
		
		
}

