/*
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
package nitesh.Ascii;
class AsciiCharBoth{
	
	void printCharacters(int startrange, int endrange){
		System.out.println("\nBelow is the list of Asciis to Characters");
		for(int i=startrange; i<=endrange;i++){
			char ch = (char)i;
			System.out.println(i+ "->" + ch);
		}
	}
	
	void printAscii(char startChar,char endChar){
		System.out.println("\n Below is the list of Characters to Asciis");
		for(char ch=startChar;ch<=endChar;ch++){
			int value = ch;
			System.out.println(ch + "->" +value);
		}
	}
	public static void main(String[] args ){
		AsciiCharBoth asciicharboth =new AsciiCharBoth();
		asciicharboth.printCharacters(65,100);
		asciicharboth.printAscii('A','Z');
	}
}