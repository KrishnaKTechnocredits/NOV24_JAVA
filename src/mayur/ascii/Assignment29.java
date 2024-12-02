/*
 * Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
 */

package mayur.ascii;

public class Assignment29 {
	
	void displayAscii(char chStart, char chEnd) {
		for (;chStart<=chEnd; chStart++) {
			int i = chStart;
			System.out.println(chStart+"  --->  "+i);
		}
	}
	
	public static void main(String[] args) {
		Assignment29  a29 = new Assignment29();
		a29.displayAscii('A','Z');
		a29.displayAscii('a', 'z');
		a29.displayAscii('0', '9');
	}

}
