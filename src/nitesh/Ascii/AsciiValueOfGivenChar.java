/*
Write a method which returns ascii value of given character. 
input : 'A'
output : 65
input : 'x'
output : 120
input : ' '
output : 32
input : '.'
output : 46
*/
package nitesh.Ascii;

class AsciiValueOfGivenChar{
	
	void getCharacter(char ch){
		int value = ch;//you are trying to assign char value to INT,and due to this Ascii value we get 
		System.out.println(value);
	}
	public static void main(String[] args){
		AsciiValueOfGivenChar asciivalueofgivenchar = new AsciiValueOfGivenChar();
		asciivalueofgivenchar.getCharacter('A' );
		asciivalueofgivenchar.getCharacter('x');
		asciivalueofgivenchar.getCharacter(' ');
		asciivalueofgivenchar.getCharacter('.');
	}
}
