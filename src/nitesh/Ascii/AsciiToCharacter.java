package nitesh.Ascii;

public class AsciiToCharacter {

	void getCharater(int  value) {
		char ch = (char)value;
		//explicit Typecasting required here as the char requires 2 bytes and Inter requires 4 bytes in memory so we can't assign value from big to small
		System.out.println(ch);
	}
	public static void main(String [] args) {
		AsciiToCharacter asciitocharacter = new AsciiToCharacter();
		asciitocharacter.getCharater(65); 
		asciitocharacter.getCharater(90); 
		asciitocharacter.getCharater(55);  
	}
}
