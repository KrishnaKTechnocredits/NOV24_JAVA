//Assignment - 27 : 2nd Dec'2024 [10 mins]
//
//Write a method which returns character of given ascii value.
//
//input : 65
//output : A
//
//input : 90
//output : Z
//
//input : 55
//output : 7 

package harshada.ascii;

public class Ascii_Ex2 {
	char ch;

	void printCharfromAscii(int ascii) {
		ch = (char) ascii;
		System.out.println("Character from ascii value " + ascii + " is " + ch);
	}

	public static void main(String[] args) {
		Ascii_Ex2 ascii_Ex2 = new Ascii_Ex2();
		ascii_Ex2.printCharfromAscii(65);
		ascii_Ex2.printCharfromAscii(90);
		ascii_Ex2.printCharfromAscii(55);
	}
}
