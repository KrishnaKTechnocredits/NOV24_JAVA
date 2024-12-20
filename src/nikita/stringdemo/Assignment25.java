/* Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46
*/


package nikita.stringdemo;

public class Assignment25 {
	int getCharToAscii (char ch) {
		int ascii = ch;
		return ascii;
	}

	public static void main(String[] args) {
		Assignment25 a25 = new Assignment25();
		char ch = 'a';
		int asciiValue = a25.getCharToAscii(ch);
		System.out.println(asciiValue);
		
		ch = 'S';
		asciiValue = a25.getCharToAscii(ch);
		System.out.println(asciiValue);
		
		ch = ' ';
		asciiValue = a25.getCharToAscii(ch);
		System.out.println(asciiValue);
		
		ch = '%';
		asciiValue = a25.getCharToAscii(ch);
		System.out.println(asciiValue);
		
		ch = '8';
		asciiValue = a25.getCharToAscii(ch);
		System.out.println(asciiValue);
	}
}
