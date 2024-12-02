/*
 * Assignment - 28 : 2nd Dec'2024 [20 mins]

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

package mayur.ascii;

public class Assignment28 {
	
	void displayChar(int startRange, int endRange) {
		for(; startRange<=endRange;startRange++) {
			char ch = (char)startRange;
			System.out.println(startRange+"  --->  "+ch);
		}
	}
	
	void displayAscii(char chStart, char chEnd) {
		for (;chStart<=chEnd; chStart++) {
			int i = chStart;
			System.out.println(chStart+"  --->  "+i);
		}
	}
	
	public static void main(String[] args) {
		Assignment28 a28 = new Assignment28();
		a28.displayChar(65, 90);
		a28.displayAscii('A', 'Z');
	}

}
