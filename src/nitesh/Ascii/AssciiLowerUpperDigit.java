package nitesh.Ascii;

public class AssciiLowerUpperDigit {
	
	void printAsscii(char startChar, char endChar){
		for(char ch=startChar;ch<=endChar;ch++){
			int asccii = ch;
			System.out.println(ch + " -> " + asccii);		}
	}
	public static void main(String[] args){
		AssciiLowerUpperDigit alud = new AssciiLowerUpperDigit();
		alud.printAsscii('A','Z');
		alud.printAsscii('a','z');
		alud.printAsscii('0','9');
	}
}
