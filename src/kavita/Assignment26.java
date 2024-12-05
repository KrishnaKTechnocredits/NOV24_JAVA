package kavita;
/*Write a method which returns ascii value of given character. 
input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46
Time: 8m*/
public class Assignment26 {
	int charAscii(char ch) {
		int ascii=ch;
		return ascii;
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26=new Assignment26();
		char ch='A';
		int asciiValue=assignment26.charAscii(ch);
		System.out.println("Ascii value of " +ch+ " is "+asciiValue);
		
		ch='x';
		asciiValue=assignment26.charAscii(ch);
		System.out.println("Ascii value of " +ch+ " is "+asciiValue);
		
		ch=' ';
		asciiValue=assignment26.charAscii(ch);
		System.out.println("Ascii value of " +ch+ " is "+asciiValue);
		
		ch='.';
		asciiValue=assignment26.charAscii(ch);
		System.out.println("Ascii value of " +ch+ " is "+asciiValue);
		
	}
}
