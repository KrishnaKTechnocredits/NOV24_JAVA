//Assignment - 26 : 2nd Dec'2024 [10 mins]
//
//Write a method which returns ascii value of given character. 
//
//input : 'A'
//output : 65
//
//input : 'x'
//output : 120
//
//input : ' '
//output : 32
//
//input : '.'
//output : 46

package harshada.ascii;

public class Ascii_Ex1 {
	int ascii;

	void findAsciiofChar(char ch) {
		ascii = ch;
		System.out.println("Ascii value of " + ch + " is " + ascii);
	}

	public static void main(String[] args) {
		Ascii_Ex1 ascii_Ex1 = new Ascii_Ex1();
		ascii_Ex1.findAsciiofChar('A');
		ascii_Ex1.findAsciiofChar('x');
		ascii_Ex1.findAsciiofChar(' ');
		ascii_Ex1.findAsciiofChar('.');
	}
}
