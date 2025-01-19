//Assignment - 29 : 2nd Dec'2024 [20 mins]
//write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).

package harshada.ascii;

public class Ascii_Ex4 {
	
	void findAsciifromChar(char startChar, char endChar) {
		int ascii;
		for(char ch=startChar;ch<=endChar;ch++) {
			ascii=ch;
			System.out.println("Ascii value of "+ch+" is "+ascii);
		}	
	}
	
	public static void main(String[] args) {
		Ascii_Ex4 ascii_Ex4=new Ascii_Ex4();
		ascii_Ex4.findAsciifromChar('A', 'Z');
		ascii_Ex4.findAsciifromChar('a', 'z');
		ascii_Ex4.findAsciifromChar('0', '9');
	}
}
