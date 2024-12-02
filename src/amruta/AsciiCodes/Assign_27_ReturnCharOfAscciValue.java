/*
 * Assignment - 27 : 2nd Dec'2024 [10 mins]

Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8 
 */
package amruta.AsciiCodes;

public class Assign_27_ReturnCharOfAscciValue {

	char returnChar(int val) {
		char ch = (char) val;
		return ch;
	}

	void printChar(int val) {
		char ch = returnChar(val);
		System.out.println("Given Ascii value is - " + val + " and it's cahracter is - " + ch);
	}

	public static void main(String[] args) {
		Assign_27_ReturnCharOfAscciValue a27 = new Assign_27_ReturnCharOfAscciValue();
		a27.printChar(65);
		a27.printChar(90);
		a27.printChar(55);
	}
}
